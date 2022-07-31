package co.com.sofka.DDDReto.Domain.Dotacion;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.dotacionCreada;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.movilCreado;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.policiaCreado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.DDDReto.Domain.Dotacion.Entities.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Dotacion extends AggregateEvent<DotacionId>{
    protected Name name;
    protected Set<Policia> policiaSet;
    protected Set<Movil> movilSet;

    public Name getName() {
        return name;
    }

    public Dotacion(DotacionId entityId) {
        super(entityId);
        subscribe(new DotacionChange(this));
    }
    public Dotacion(DotacionId entityId, Name name) {
        super(entityId);
        appendChange(new dotacionCreada(name)).apply();
    }

    public static Dotacion from(DotacionId dotacionId, List<DomainEvent> domainEvents) {
        Dotacion dotacion = new Dotacion(dotacionId);
        domainEvents.forEach(dotacion::applyEvent);
        return dotacion;
    }

    //Eventos
    public void crearPolicia(Name name, Documento documento, Nombre nombre, Grado grado,
                             Implemento implemento, Rol rol) {
        PoliciaId policiaId = new PoliciaId();
        appendChange(new policiaCreado(policiaId, documento, nombre, grado, implemento, rol)).apply();
    }
    public void crearMovil(Name name, Matricula maricula, Tipo tipo, Marca marca,
                           Implemento implemento, Modelo modelo) {
        MovilId movilId = new MovilId();
        appendChange(new movilCreado(movilId, maricula, tipo, marca,
                implemento, modelo)).apply();
    }

}//fin clase

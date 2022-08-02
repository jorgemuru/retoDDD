package co.com.sofka.DDDReto.Domain.Dotacion;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.DotacionCreada;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.MovilCreado;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.PoliciaActualizado;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.PoliciaCreado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.DDDReto.Domain.Dotacion.Entities.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Optional;
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
    public Dotacion(DotacionId entityId, Name name, Observaciones observaciones) {
        super(entityId);
        appendChange(new DotacionCreada(name, observaciones)).apply();
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
        appendChange(new PoliciaCreado(policiaId, documento, nombre, grado, implemento, rol)).apply();
    }
    public void crearMovil(Name name, Matricula maricula, Tipo tipo, Marca marca,
                           Implemento implemento, Modelo modelo) {
        MovilId movilId = new MovilId();
        appendChange(new MovilCreado(movilId, maricula, tipo, marca,
                implemento, modelo)).apply();
    }

    public void actualizarPolicia(DotacionId dotacionId, Documento documento, Nombre nombre, Grado grado,
                                  Implemento implemento, Rol rol){
        appendChange(new PoliciaActualizado(dotacionId, documento, nombre, grado, implemento, rol)).apply();
    }
    protected Optional<Policia> findClientById(PoliciaId policiaId) {
        return this.policiaSet.stream().filter(policia -> policia.identity().equals(policiaId)).findFirst();
    }

}//fin clase

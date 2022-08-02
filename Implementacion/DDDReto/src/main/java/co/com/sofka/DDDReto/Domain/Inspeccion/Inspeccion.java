package co.com.sofka.DDDReto.Domain.Inspeccion;
import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.DDDReto.Domain.Dotacion.DotacionChange;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.dotacionCreada;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.movilCreado;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.DotacionId;
import co.com.sofka.DDDReto.Domain.Inspeccion.Entities.*;
import co.com.sofka.DDDReto.Domain.Inspeccion.Events.ElementoCreado;
import co.com.sofka.DDDReto.Domain.Inspeccion.Events.InspeccionCreada;
import co.com.sofka.DDDReto.Domain.Inspeccion.Events.PersonaCreada;
import co.com.sofka.DDDReto.Domain.Inspeccion.Events.VehiculoCreado;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Inspeccion extends AggregateEvent<InspeccionId> {
    protected Name name;
    protected Set<Elemento> elementoSet;
    protected Set<Persona> personaSet;
    protected Set<Vehiculo> vehiculoSet;
    public Name getName() {
        return name;
    }

    public Inspeccion(InspeccionId entityId) {
        super(entityId);
        subscribe(new InspeccionChange(this));
    }

    public Inspeccion(InspeccionId entityId, Name name, Colaboracion colaboracion, Tipo tipo) {
        super(entityId);
        appendChange(new InspeccionCreada(name, colaboracion, tipo)).apply();
    }
    public static Inspeccion from(InspeccionId inspeccionId, List<DomainEvent> domainEvents) {
        Inspeccion inspeccion = new Inspeccion(inspeccionId);
        domainEvents.forEach(inspeccion::applyEvent);
        return inspeccion;
    }

    //Eventos
    public void crearElemento(Name name, NombreElemento nombreElemento, Descripcion descripcion,
                              Tipo tipo, NumeroSerie numeroSerie){
        ElementoId elementoId = new ElementoId();
        appendChange(new ElementoCreado(elementoId, nombreElemento, descripcion, tipo, numeroSerie)).apply();
    }
    public void crearPersona(Name name, NombrePersona nombrePersona, Edad edad, Nacionalidad nacionalidad,
                             Domicilio domicilio, Documento documento, Rol rol){
        PersonaId personaId = new PersonaId();
        appendChange(new PersonaCreada(personaId, nombrePersona, edad, nacionalidad, domicilio,
                documento, rol)).apply();
    }
    public void crearVehiculo(Name name, Marca marca, Modelo modelo, Color color, Anio anio,
                              Matricula matricula, Tipo tipo, Propietario propietario){
        VehiculoId vehiculoId = new VehiculoId();
        appendChange(new VehiculoCreado(vehiculoId, marca, modelo,  color, anio, matricula, tipo,
                propietario)).apply();
    }

}//fin clase

package co.com.sofka.DDDReto.Domain.Operativo.Events;

import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.DomainEvent;


public class OperativoCreado extends DomainEvent {
    private final Name name;
    private final Fecha fecha;
    private final Hora hora;
    private final Objetivo objetivo;
    private final Observaciones observaciones;

    public OperativoCreado(Name name, Fecha fecha, Hora hora, Objetivo objetivo, Observaciones observaciones) {
        super("co.com.sofka.DDDReto.Domain.Operativo.OperativoCreado");
        this.name = name;
        this.fecha = fecha;
        this.hora = hora;
        this.objetivo = objetivo;
        this.observaciones = observaciones;
    }

    public Name getName() {
        return name;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }
}

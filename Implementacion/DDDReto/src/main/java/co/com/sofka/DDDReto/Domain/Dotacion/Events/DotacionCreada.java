package co.com.sofka.DDDReto.Domain.Dotacion.Events;

import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class DotacionCreada extends DomainEvent {
    private final Name name;
    private final Observaciones observaciones;

    public DotacionCreada(Name name, Observaciones observaciones) {
        super("co.com.sofka.DDDReto.Domain.Dotacion.dotacionCreada");
        this.name = name;
        this.observaciones = observaciones;
    }

    public Name getName() {
        return this.name;
    }

    public Observaciones getObservaciones() {
        return observaciones;
    }
}

package co.com.sofka.DDDReto.Domain.Dotacion.Events;

import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class dotacionCreada extends DomainEvent {
    private final Name name;


    public dotacionCreada(Name name) {
        super("co.com.sofka.DDDReto.Domain.Dotacion.dotacionCreada");
        this.name = name;
    }

    public Name getName() {
        return this.name;
    }
}

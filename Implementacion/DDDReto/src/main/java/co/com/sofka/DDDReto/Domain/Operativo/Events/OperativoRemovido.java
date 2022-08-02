package co.com.sofka.DDDReto.Domain.Operativo.Events;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class OperativoRemovido extends DomainEvent{
    private final OperativoId operativoId;
    private final Boolean wasDeleted;

    public OperativoRemovido(OperativoId operativoId) {
        super("co.com.sofka.DDDReto.Domain.Operativo.OperativoRemovido");
        this.operativoId = operativoId;
        this.wasDeleted = true;
    }

    public OperativoId getOperativoId() {
        return operativoId;
    }

    public Boolean getWasDeleted() {
        return wasDeleted;
    }
}

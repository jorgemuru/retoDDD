package co.com.sofka.DDDReto.Domain.Dotacion.commands;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.Command;

public class crearDotacion extends Command{
    private final DotacionId entityId;
    private final Name name;
    private final Observaciones observaciones;

    public crearDotacion(DotacionId entityId, Name name, Observaciones observaciones) {
        this.entityId = entityId;
        this.name = name;
        this.observaciones = observaciones;
    }

    public DotacionId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
    public Observaciones getObservaciones() {
        return observaciones;
    }
}

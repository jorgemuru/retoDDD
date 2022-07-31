package co.com.sofka.DDDReto.Domain.Inspeccion.commands;

import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;
import co.com.sofka.domain.generic.Command;

public class CrearInspeccion extends Command{
    private final InspeccionId entityId;
    private final Name name;
    private final Colaboracion colaboracion;
    private final Tipo tipo;

    public CrearInspeccion(InspeccionId entityId, Name name, Colaboracion colaboracion, Tipo tipo) {
        this.entityId = entityId;
        this.name = name;
        this.colaboracion = colaboracion;
        this.tipo = tipo;
    }

    public InspeccionId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Colaboracion getColaboracion() {
        return colaboracion;
    }

    public Tipo getTipo() {
        return tipo;
    }

}

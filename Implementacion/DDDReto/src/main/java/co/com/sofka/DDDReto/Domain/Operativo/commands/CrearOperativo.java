package co.com.sofka.DDDReto.Domain.Operativo.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;

public class CrearOperativo extends Command {
    private final OperativoId entityId;
    private final Name name;
    private final Fecha fecha;
    private final Hora hora;
    private final Objetivo objetivo;
    private final Observaciones observaciones;

    public CrearOperativo(OperativoId entityId, Name name, Fecha fecha, Hora hora,
                          Objetivo objetivo, Observaciones observaciones) {
        this.entityId = entityId;
        this.name = name;
        this.fecha = fecha;
        this.hora = hora;
        this.objetivo = objetivo;
        this.observaciones = observaciones;
    }

    public OperativoId getEntityId() {
        return entityId;
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

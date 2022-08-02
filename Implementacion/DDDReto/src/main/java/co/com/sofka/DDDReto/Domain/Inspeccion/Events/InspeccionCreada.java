package co.com.sofka.DDDReto.Domain.Inspeccion.Events;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class InspeccionCreada extends DomainEvent{
    private final Name name;
    private final Colaboracion colaboracion;
    private final Tipo tipo;
    public InspeccionCreada(Name name, Colaboracion colaboracion, Tipo tipo) {
        super("co.com.sofka.DDDReto.Domain.Inspeccion.InspeccionCreada");
        this.name = name;
        this.colaboracion = colaboracion;
        this.tipo = tipo;
    }
    public Name getName() {
        return this.name;
    }

    public Colaboracion getColaboracion() {
        return colaboracion;
    }

    public Tipo getTipo() {
        return tipo;
    }
}

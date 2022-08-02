package co.com.sofka.DDDReto.Domain.Inspeccion.Events;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class ElementoCreado extends DomainEvent{
    private final ElementoId elementoId;
    private final NombreElemento nombreElemento;
    private final Descripcion descripcion;
    private final Tipo tipo;
    private final NumeroSerie numeroSerie;

    public ElementoCreado(ElementoId elementoId, NombreElemento nombreElemento, Descripcion descripcion,
                          Tipo tipo, NumeroSerie numeroSerie) {
        super("co.com.sofka.DDDReto.Domain.Inspeccion.ElementoCreado");
        this.elementoId = elementoId;
        this.nombreElemento = nombreElemento;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public ElementoId getElementoId() {
        return elementoId;
    }

    public NombreElemento getNombreElemento() {
        return nombreElemento;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public NumeroSerie getNumeroSerie() {
        return numeroSerie;
    }
}

package co.com.sofka.DDDReto.Domain.Inspeccion.Entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;

public class Elemento extends Entity<ElementoId>{
    private NombreElemento nombreElemento;
    private Descripcion descripcion;
    private Tipo tipo;
    private NumeroSerie numeroSerie;

    public Elemento(ElementoId entityId, NombreElemento nombreElemento,
                    Descripcion descripcion, Tipo tipo, NumeroSerie numeroSerie) {
        super(entityId);
        this.nombreElemento = nombreElemento;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
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

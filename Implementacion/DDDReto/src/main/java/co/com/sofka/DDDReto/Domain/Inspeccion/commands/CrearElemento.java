package co.com.sofka.DDDReto.Domain.Inspeccion.commands;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;

public class CrearElemento extends Command{
    private final Name name;
    private final NombreElemento nombreElemento;
    private final Descripcion descripcion;
    private final Tipo tipo;
    private final NumeroSerie numeroSerie;

    public CrearElemento(Name name, NombreElemento nombreElemento, Descripcion descripcion,
                         Tipo tipo, NumeroSerie numeroSerie) {
        this.name = name;
        this.nombreElemento = nombreElemento;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public Name getName() {
        return name;
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

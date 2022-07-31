package co.com.sofka.DDDReto.Domain.Dotacion.commands;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.Command;

public class crearMovil extends Command{
    private final DotacionId dotacionId;
    private final Matricula maricula;
    private final Tipo tipo;
    private final Marca marca;
    private final Implemento implemento;
    private final Modelo modelo;
    private final Name name;

    public crearMovil(DotacionId dotacionId, Matricula maricula, Tipo tipo,
                      Marca marca, Implemento implemento, Modelo modelo, Name name) {
        this.dotacionId = dotacionId;
        this.maricula = maricula;
        this.tipo = tipo;
        this.marca = marca;
        this.implemento = implemento;
        this.modelo = modelo;
        this.name = name;
    }

    public DotacionId getDotacionId() {
        return dotacionId;
    }

    public Matricula getMaricula() {
        return maricula;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public Implemento getImplemento() {
        return implemento;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Name getName() {
        return name;
    }
}

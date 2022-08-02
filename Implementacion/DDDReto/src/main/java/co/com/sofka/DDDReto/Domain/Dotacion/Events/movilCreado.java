package co.com.sofka.DDDReto.Domain.Dotacion.Events;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class movilCreado extends DomainEvent{
    private final MovilId movilId;
    private final Matricula maricula;
    private final Tipo tipo;
    private final Marca marca;
    private final Implemento implemento;
    private final Modelo modelo;

    public movilCreado(MovilId movilId, Matricula maricula, Tipo tipo, Marca marca,
                       Implemento implemento, Modelo modelo) {
        super("co.com.sofka.DDDReto.Domain.Dotacion.movilCreado");
        this.movilId = movilId;
        this.maricula = maricula;
        this.tipo = tipo;
        this.marca = marca;
        this.implemento = implemento;
        this.modelo = modelo;
    }

    public MovilId getMovilId() {
        return movilId;
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
}

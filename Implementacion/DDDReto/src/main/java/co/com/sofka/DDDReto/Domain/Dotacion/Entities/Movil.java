package co.com.sofka.DDDReto.Domain.Dotacion.Entities;

import co.com.sofka.DDDReto.Domain.Dotacion.Values.MovilId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;

import java.util.Objects;

public class Movil extends Entity<MovilId> {
    private Matricula maricula;
    private Tipo tipo;
    private Marca marca;
    private Implemento implemento;
    private Modelo modelo;

    public Movil(MovilId entityId, Matricula maricula, Tipo tipo,
                 Marca marca, Implemento implemento, Modelo modelo) {
        super(entityId);
        this.maricula = maricula;
        this.tipo = tipo;
        this.marca = marca;
        this.implemento = implemento;
        this.modelo = modelo;
    }

    public Matricula getMaricula() {
        return maricula;
    }
    public void updateMatricula(Matricula matricula){
        this.maricula = Objects.requireNonNull(matricula);
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void updateTipo(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo);
    }
    public Marca getMarca() {
        return marca;
    }
    public void updateMarca(Marca marca){
        this.marca = Objects.requireNonNull(marca);
    }
    public Implemento getImplemento() {
        return implemento;
    }
    public void updateImplemento(Implemento implemento){
        this.implemento = Objects.requireNonNull(implemento);
    }

    public Modelo getModelo() {
        return modelo;
    }
    public void updateModelo(Modelo modelo){
        this.modelo = Objects.requireNonNull(modelo);
    }

}//fin clase

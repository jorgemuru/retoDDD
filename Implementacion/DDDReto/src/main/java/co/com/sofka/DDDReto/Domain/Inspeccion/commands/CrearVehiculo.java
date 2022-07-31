package co.com.sofka.DDDReto.Domain.Inspeccion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;

public class CrearVehiculo extends Command {
    private final Name name;
    private final Marca marca;
    private final Modelo modelo;
    private final Color color;
    private final Anio anio;
    private final Matricula matricula;
    private final Tipo tipo;
    private final Propietario propietario;

    public CrearVehiculo(Name name, Marca marca, Modelo modelo, Color color,
                         Anio anio, Matricula matricula, Tipo tipo, Propietario propietario) {
        this.name = name;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.matricula = matricula;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public Name getName() {
        return name;
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public Anio getAnio() {
        return anio;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}

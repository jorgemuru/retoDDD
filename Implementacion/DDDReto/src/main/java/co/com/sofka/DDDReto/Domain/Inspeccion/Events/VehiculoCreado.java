package co.com.sofka.DDDReto.Domain.Inspeccion.Events;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class VehiculoCreado extends DomainEvent{
    private final VehiculoId vehiculoId;
    private final Marca marca;
    private final Modelo modelo;
    private final Color color;
    private final Anio anio;
    private final Matricula matricula;
    private final Tipo tipo;
    private final Propietario propietario;

    public VehiculoCreado(VehiculoId vehiculoId, Marca marca, Modelo modelo, Color color, Anio anio,
                          Matricula matricula, Tipo tipo, Propietario propietario) {
        super("co.com.sofka.DDDReto.Domain.Inspeccion.VehiculoCreado");
        this.vehiculoId = vehiculoId;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.matricula = matricula;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
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

package co.com.sofka.DDDReto.Domain.Inspeccion.Entities;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;

public class Vehiculo extends Entity<VehiculoId>{
    private Marca marca;
    private Modelo modelo;
    private Color color;
    private Anio anio;
    private Matricula matricula;
    private Tipo tipo;
    private Propietario propietario;

    public Vehiculo(VehiculoId entityId, Marca marca, Modelo modelo, Color color, Anio anio,
                    Matricula matricula, Tipo tipo, Propietario propietario) {
        super(entityId);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.matricula = matricula;
        this.tipo = tipo;
        this.propietario = propietario;
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

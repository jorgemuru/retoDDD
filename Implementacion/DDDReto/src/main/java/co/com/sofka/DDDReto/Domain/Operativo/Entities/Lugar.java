package co.com.sofka.DDDReto.Domain.Operativo.Entities;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.Entity;

public class Lugar extends Entity<LugarId> {
    private Ruta ruta;
    private Kilometro kilometro;
    private Ciudad ciudad;
    private Departamento departamento;

    public Lugar(LugarId entityId, Ruta ruta, Kilometro kilometro, Ciudad ciudad, Departamento departamento) {
        super(entityId);
        this.ruta = ruta;
        this.kilometro = kilometro;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public Kilometro getKilometro() {
        return kilometro;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}

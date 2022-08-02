package co.com.sofka.DDDReto.Domain.Operativo.Events;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class LugarCreado extends DomainEvent{
    private final LugarId lugarId;
    private final Name name;
    private final Ruta ruta;
    private final Kilometro kilometro;
    private final Ciudad ciudad;
    private final Departamento departamento;

    public LugarCreado(LugarId lugarId, Name name, Ruta ruta, Kilometro kilometro, Ciudad ciudad,
                       Departamento departamento) {
        super("co.com.sofka.DDDReto.Domain.Operativo.lugarCreado");
        this.lugarId = lugarId;
        this.name = name;
        this.ruta = ruta;
        this.kilometro = kilometro;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public LugarId getLugarId() {
        return lugarId;
    }

    public Name getName() {
        return name;
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

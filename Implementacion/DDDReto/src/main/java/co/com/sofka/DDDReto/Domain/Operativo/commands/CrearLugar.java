package co.com.sofka.DDDReto.Domain.Operativo.commands;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;

public class CrearLugar extends Command{
    private final OperativoId entityId;
    private final Name name;
    private final Ruta ruta;
    private final Kilometro kilometro;
    private final Ciudad ciudad;
    private final Departamento departamento;

    public CrearLugar(OperativoId entityId, Name name, Ruta ruta, Kilometro kilometro,
                      Ciudad ciudad, Departamento departamento) {
        this.entityId = entityId;
        this.name = name;
        this.ruta = ruta;
        this.kilometro = kilometro;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public OperativoId getEntityId() {
        return entityId;
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

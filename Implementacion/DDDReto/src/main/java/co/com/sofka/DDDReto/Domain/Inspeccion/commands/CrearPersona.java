package co.com.sofka.DDDReto.Domain.Inspeccion.commands;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;

public class CrearPersona extends Command{
    private final Name name;
    private final InspeccionId inspeccionId;
    private final NombrePersona nombrePersona;
    private final Edad edad;
    private final Nacionalidad nacionalidad;
    private final Domicilio domicilio;
    private final Documento documento;
    private final Rol rol;

    public CrearPersona(InspeccionId inspeccionId, Name name, NombrePersona nombrePersona, Edad edad, Nacionalidad nacionalidad,
                        Domicilio domicilio, Documento documento, Rol rol) {
        this.inspeccionId = inspeccionId;
        this.name = name;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
        this.documento = documento;
        this.rol = rol;
    }

    public InspeccionId getInspeccionId() {
        return inspeccionId;
    }

    public Name getName() {
        return name;
    }

    public NombrePersona getNombrePersona() {
        return nombrePersona;
    }

    public Edad getEdad() {
        return edad;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Rol getRol() {
        return rol;
    }

}

package co.com.sofka.DDDReto.Domain.Inspeccion.Entities;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;

public class Persona extends Entity<PersonaId>{
    private NombrePersona nombrePersona;
    private Edad edad;
    private Nacionalidad nacionalidad;
    private Domicilio domicilio;
    private Documento documento;
    private Rol rol;

    public Persona(PersonaId entityId, NombrePersona nombrePersona, Edad edad,
                   Nacionalidad nacionalidad, Domicilio domicilio, Documento documento, Rol rol) {
        super(entityId);
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
        this.documento = documento;
        this.rol = rol;
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

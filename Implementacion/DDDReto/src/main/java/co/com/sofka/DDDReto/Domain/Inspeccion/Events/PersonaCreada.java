package co.com.sofka.DDDReto.Domain.Inspeccion.Events;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class PersonaCreada extends DomainEvent{
    private final PersonaId personaId;
    private final NombrePersona nombrePersona;
    private final Edad edad;
    private final Nacionalidad nacionalidad;
    private final Domicilio domicilio;
    private final Documento documento;
    private final Rol rol;

    public PersonaCreada(PersonaId personaId, NombrePersona nombrePersona, Edad edad, Nacionalidad nacionalidad,
                         Domicilio domicilio, Documento documento, Rol rol) {
        super("co.com.sofka.DDDReto.Domain.Inspeccion.PersonaCreada");
        this.personaId = personaId;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
        this.documento = documento;
        this.rol = rol;
    }

    public PersonaId getPersonaId() {
        return personaId;
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

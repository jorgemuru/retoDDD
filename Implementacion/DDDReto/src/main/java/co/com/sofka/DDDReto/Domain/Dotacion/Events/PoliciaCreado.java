package co.com.sofka.DDDReto.Domain.Dotacion.Events;

import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class PoliciaCreado extends DomainEvent{
    private final PoliciaId policiaId;
    private final Documento documento;
    private final Nombre nombre;
    private final Grado grado;
    private final Implemento implemento;
    private final Rol rol;

    public PoliciaCreado(PoliciaId policiaId, Documento documento, Nombre nombre,
                         Grado grado, Implemento implemento, Rol rol) {
        super("co.com.sofka.DDDReto.Domain.Dotacion.policiaCreado");
        this.policiaId = policiaId;
        this.documento = documento;
        this.nombre = nombre;
        this.grado = grado;
        this.implemento = implemento;
        this.rol = rol;
    }

    public PoliciaId getPoliciaId() {
        return policiaId;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Grado getGrado() {
        return grado;
    }

    public Implemento getImplemento() {
        return implemento;
    }

    public Rol getRol() {
        return rol;
    }
}

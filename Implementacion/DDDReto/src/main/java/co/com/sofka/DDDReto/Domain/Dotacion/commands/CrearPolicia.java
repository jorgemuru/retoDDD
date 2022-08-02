package co.com.sofka.DDDReto.Domain.Dotacion.commands;

import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.Command;

public class CrearPolicia extends Command {
    private final DotacionId dotacionId;
    private final Documento documento;
    private final Nombre nombre;
    private final Grado grado;
    private final Implemento implemento;
    private final Rol rol;
    private final Name name;

    public CrearPolicia(DotacionId dotacionId, Documento documento, Nombre nombre,
                        Grado grado, Implemento implemento, Rol rol, Name name) {
        this.dotacionId = dotacionId;
        this.documento = documento;
        this.nombre = nombre;
        this.grado = grado;
        this.implemento = implemento;
        this.rol = rol;
        this.name = name;
    }

    public DotacionId getDotacionId() {
        return dotacionId;
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
    public Name getName() {
        return name;
    }
}

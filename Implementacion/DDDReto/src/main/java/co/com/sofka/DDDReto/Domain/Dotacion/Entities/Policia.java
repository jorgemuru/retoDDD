package co.com.sofka.DDDReto.Domain.Dotacion.Entities;

import co.com.sofka.DDDReto.Domain.Dotacion.Values.PoliciaId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;

import java.util.Objects;

public class Policia extends Entity<PoliciaId> {
    private Documento documento;
    private Nombre nombre;
    private Grado grado;
    private Implemento implemento;
    private Rol rol;

    public Policia(PoliciaId entityId, Documento documento, Nombre nombre,
                   Grado grado, Implemento implemento, Rol rol) {
        super(entityId);
        this.documento = documento;
        this.nombre = nombre;
        this.grado = grado;
        this.implemento = implemento;
        this.rol = rol;
    }

    public Documento getDocumento() {
        return documento;
    }
    public void updateDocumento(Documento documento){
        this.documento = Objects.requireNonNull(documento);
    }

    public Nombre getNombre() {
        return nombre;
    }
    public void updateNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Grado getGrado() {
        return grado;
    }
    public void updateGrado(Grado grado){
        this.grado = Objects.requireNonNull(grado);
    }

    public Implemento getImplemento() {
        return implemento;
    }
    public void updateImplemento(Implemento implemento){
        this.implemento = Objects.requireNonNull(implemento);
    }

    public Rol getRol() {
        return rol;
    }
    public void updateRol(Rol rol){
        this.rol = Objects.requireNonNull(rol);
    }

}//fin clase

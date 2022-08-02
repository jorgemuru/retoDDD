package co.com.sofka.DDDReto.Domain.Inspeccion;
import co.com.sofka.DDDReto.Domain.Inspeccion.Entities.*;
import co.com.sofka.DDDReto.Domain.Inspeccion.Events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class InspeccionChange extends EventChange{
    InspeccionChange(Inspeccion inspeccion) {
        apply((InspeccionCreada event) -> {
            inspeccion.name = event.getName();
            inspeccion.elementoSet = new HashSet<>();
            inspeccion.personaSet = new HashSet<>();
            inspeccion.vehiculoSet = new HashSet<>();
        });

        apply((ElementoCreado event) -> {
            Elemento elemento = new Elemento(event.getElementoId(), event.getNombreElemento(), event.getDescripcion(),
                    event.getTipo(), event.getNumeroSerie());
            inspeccion.elementoSet.add(elemento);
        });
        apply((PersonaCreada event) -> {
            Persona persona = new Persona(event.getPersonaId(), event.getNombrePersona(), event.getEdad(),
                    event.getNacionalidad(), event.getDomicilio(), event.getDocumento(), event.getRol());
            inspeccion.personaSet.add(persona);
        });
        apply((VehiculoCreado event) -> {
            Vehiculo vehiculo = new Vehiculo(event.getVehiculoId(), event.getMarca(), event.getModelo(),
                    event.getColor(), event.getAnio(), event.getMatricula(), event.getTipo(), event.getPropietario());
            inspeccion.vehiculoSet.add(vehiculo);
        });
    }
}

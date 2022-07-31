package co.com.sofka.DDDReto.Domain.Dotacion;
import co.com.sofka.DDDReto.Domain.Dotacion.Entities.Movil;
import co.com.sofka.DDDReto.Domain.Dotacion.Entities.Policia;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.DDDReto.Domain.Dotacion.Events.*;

import java.util.HashSet;

public class DotacionChange extends EventChange {
    DotacionChange(Dotacion dotacion) {
        apply((dotacionCreada event) -> {
            dotacion.name = event.getName();
            dotacion.policiaSet = new HashSet<>();
            dotacion.movilSet = new HashSet<>();
        });

        apply((policiaCreado event) -> {
            Policia policia = new Policia(event.getPoliciaId(), event.getDocumento(), event.getNombre(),
                    event.getGrado(), event.getImplemento(), event.getRol());
            dotacion.policiaSet.add(policia);
        });
        apply((movilCreado event) -> {
            Movil movil = new Movil(event.getMovilId(), event.getMaricula(), event.getTipo(),
                    event.getMarca(), event.getImplemento(), event.getModelo());
            dotacion.movilSet.add(movil);
        });
    }
}

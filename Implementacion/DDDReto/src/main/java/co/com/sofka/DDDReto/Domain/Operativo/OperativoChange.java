package co.com.sofka.DDDReto.Domain.Operativo;
;
import co.com.sofka.DDDReto.Domain.Operativo.Entities.*;
import co.com.sofka.DDDReto.Domain.Operativo.Events.*;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class OperativoChange extends EventChange{
    OperativoChange(Operativo operativo) {
        apply((OperativoCreado event) -> {
            operativo.name = event.getName();
            operativo.lugarSet = new HashSet<>();
            operativo.informeSet = new HashSet<>();
            operativo.dotacionSet = new HashSet<>();
            operativo.inspeccionSet = new HashSet<>();
        });

        apply((LugarCreado event) -> {
            Lugar lugar = new Lugar(event.getLugarId(), event.getRuta(), event.getKilometro(),
                    event.getCiudad(), event.getDepartamento());
            operativo.lugarSet.add(lugar);
        });
        apply((InformeCreado event) -> {
            Informe informe = new Informe(event.getInformeId(), event.getTitulo(), event.getSubtitulo(),
                    event.getNarracion(), event.getAutor(), event.getNumeroevento());
            operativo.informeSet.add(informe);
        });
        apply((InformeCreado event) -> {
            Informe informe = new Informe(event.getInformeId(), event.getTitulo(), event.getSubtitulo(),
                    event.getNarracion(), event.getAutor(), event.getNumeroevento());
            operativo.informeSet.add(informe);
        });
    }
}

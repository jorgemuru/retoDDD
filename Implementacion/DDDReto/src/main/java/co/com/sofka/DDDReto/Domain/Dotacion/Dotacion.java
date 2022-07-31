package co.com.sofka.DDDReto.Domain.Dotacion;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.DotacionId;

public class Dotacion extends AggregateEvent<DotacionId>{
    public Dotacion(DotacionId entityId) {
        super(entityId);
    }

}//fin clase

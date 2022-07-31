package co.com.sofka.DDDReto.Domain.Inspeccion;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.InspeccionId;

public class Inspeccion extends AggregateEvent<InspeccionId> {
    public Inspeccion(InspeccionId entityId) {
        super(entityId);
    }

}//fin clase

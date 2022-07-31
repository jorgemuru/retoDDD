package co.com.sofka.DDDReto.Domain.Operativo;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.DDDReto.Domain.Operativo.Values.OperativoId;

public class Operativo extends AggregateEvent<OperativoId>{
    public Operativo(OperativoId entityId) {
        super(entityId);
    }
}//fin clase
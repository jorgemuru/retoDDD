package co.com.sofka.DDDReto.Domain.Inspeccion.Values;
import co.com.sofka.domain.generic.Identity;

public class ElementoId extends Identity{
    public ElementoId() {
        super();
    }
    private ElementoId(String id) {
        super(id);
    }
    public static ElementoId of(String id){
        return new ElementoId(id);
    }
}

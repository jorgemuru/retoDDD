package co.com.sofka.DDDReto.Domain.Inspeccion.Values;
import co.com.sofka.domain.generic.Identity;

public class InspeccionId extends Identity{
    public InspeccionId() {
        super();
    }
    private InspeccionId(String id){
        super(id);
    }
    public static InspeccionId of(String id){
        return new InspeccionId(id);
    }
}//fin clase

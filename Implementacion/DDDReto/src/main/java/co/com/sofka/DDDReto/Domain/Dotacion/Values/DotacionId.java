package co.com.sofka.DDDReto.Domain.Dotacion.Values;
import co.com.sofka.domain.generic.Identity;

public class DotacionId extends Identity{
    public DotacionId() {
        super();
    }
    private DotacionId(String id){
        super(id);
    }
    public static DotacionId of(String id){
        return new DotacionId(id);
    }

}//fin clase

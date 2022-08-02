package co.com.sofka.DDDReto.Domain.Operativo.Values;
import co.com.sofka.domain.generic.Identity;

public class OperativoId extends Identity{
    public OperativoId() {
        super();
    }
    private OperativoId(String id){
        super(id);
    }
    public static OperativoId of(String id){
        return new OperativoId(id);
    }

}//fin clase


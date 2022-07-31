package co.com.sofka.DDDReto.Domain.Dotacion.Values;
import co.com.sofka.DDDReto.Domain.Dotacion.Entities.*;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.domain.generic.Identity;

public class DotacionId extends Identity{
    protected Policia policia;
    protected Movil movil;
    protected Observaciones observaciones;

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

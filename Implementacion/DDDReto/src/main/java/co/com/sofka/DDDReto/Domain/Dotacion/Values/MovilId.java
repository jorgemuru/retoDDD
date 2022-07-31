package co.com.sofka.DDDReto.Domain.Dotacion.Values;
import co.com.sofka.domain.generic.Identity;

public class MovilId extends Identity {
    public MovilId() {
        super();
    }
    private MovilId(String id) {
        super(id);
    }
    public static MovilId of(String id){
        return new MovilId(id);
    }
}

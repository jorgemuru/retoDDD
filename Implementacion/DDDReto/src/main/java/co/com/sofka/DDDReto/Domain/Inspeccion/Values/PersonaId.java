package co.com.sofka.DDDReto.Domain.Inspeccion.Values;
import co.com.sofka.domain.generic.Identity;

public class PersonaId extends Identity{
    public PersonaId() {
        super();
    }
    private PersonaId(String id) {
        super(id);
    }
    public static PersonaId of(String id){
        return new PersonaId(id);
    }
}

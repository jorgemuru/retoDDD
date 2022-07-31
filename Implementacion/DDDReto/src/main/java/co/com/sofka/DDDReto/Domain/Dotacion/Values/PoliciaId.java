package co.com.sofka.DDDReto.Domain.Dotacion.Values;

import co.com.sofka.domain.generic.Identity;

public class PoliciaId extends Identity {
    public PoliciaId() {
        super();
    }
    private PoliciaId(String id) {
        super(id);
    }
    public static PoliciaId of(String id){
        return new PoliciaId(id);
    }
}

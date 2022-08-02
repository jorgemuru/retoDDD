package co.com.sofka.DDDReto.Domain.Operativo.Values;

import co.com.sofka.domain.generic.Identity;

public class LugarId extends Identity {
    public LugarId() {
        super();
    }
    private LugarId(String id){
        super(id);
    }
    public static LugarId of(String id){
        return new LugarId(id);
    }
}

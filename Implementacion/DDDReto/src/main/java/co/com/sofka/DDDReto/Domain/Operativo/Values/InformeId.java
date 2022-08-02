package co.com.sofka.DDDReto.Domain.Operativo.Values;

import co.com.sofka.domain.generic.Identity;

public class InformeId extends Identity {
    public InformeId() {
        super();
    }
    private InformeId(String id){
        super(id);
    }
    public static InformeId of(String id){
        return new InformeId(id);
    }
}

package co.com.sofka.DDDReto.Domain.Inspeccion.Values;

import co.com.sofka.domain.generic.Identity;

public class VehiculoId extends Identity {
    public VehiculoId() {
        super();
    }
    private VehiculoId(String id) {
        super(id);
    }
    public static VehiculoId of(String id){
        return new VehiculoId(id);
    }
}

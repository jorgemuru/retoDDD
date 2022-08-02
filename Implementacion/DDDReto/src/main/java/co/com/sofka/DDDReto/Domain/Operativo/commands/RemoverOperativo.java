package co.com.sofka.DDDReto.Domain.Operativo.commands;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.DotacionId;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.InspeccionId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;

public class RemoverOperativo extends Command{
    private final OperativoId operativoId;
    private final InformeId informeId;
    private final LugarId lugarId;
    private final InspeccionId inspeccionId;
    private final DotacionId dotacionId;

    public RemoverOperativo(OperativoId operativoId, InformeId informeId, LugarId lugarId,
                            InspeccionId inspeccionId, DotacionId dotacionId) {
        this.operativoId = operativoId;
        this.informeId = informeId;
        this.lugarId = lugarId;
        this.inspeccionId = inspeccionId;
        this.dotacionId = dotacionId;
    }

    public OperativoId getOperativoId() {
        return operativoId;
    }

    public InformeId getInformeId() {
        return informeId;
    }

    public LugarId getLugarId() {
        return lugarId;
    }

    public InspeccionId getInspeccionId() {
        return inspeccionId;
    }

    public DotacionId getDotacionId() {
        return dotacionId;
    }
}

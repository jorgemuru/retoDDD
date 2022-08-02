package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Inspeccion.Inspeccion;
import co.com.sofka.DDDReto.Domain.Inspeccion.commands.CrearInspeccion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearInspeccionUseCase extends UseCase<RequestCommand<CrearInspeccion>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CrearInspeccion> CrearInspeccionRequestCommand) {
        var command = CrearInspeccionRequestCommand.getCommand();

        var inspeccion = new Inspeccion(command.getEntityId(), command.getName(), command.getColaboracion(),
                command.getTipo());

        emit().onResponse(new ResponseEvents(inspeccion.getUncommittedChanges()));
    }
}

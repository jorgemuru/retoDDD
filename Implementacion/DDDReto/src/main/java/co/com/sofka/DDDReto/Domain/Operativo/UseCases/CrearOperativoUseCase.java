package co.com.sofka.DDDReto.Domain.Operativo.UseCases;

import co.com.sofka.DDDReto.Domain.Operativo.Operativo;
import co.com.sofka.DDDReto.Domain.Operativo.commands.CrearOperativo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearOperativoUseCase extends UseCase<RequestCommand<CrearOperativo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearOperativo> CrearOperativoRequestCommand) {
        var command = CrearOperativoRequestCommand.getCommand();
        var operativo = new Operativo(command.getEntityId(), command.getName(), command.getFecha(),
                command.getHora(), command.getObjetivo(), command.getObservaciones());

        emit().onResponse(new ResponseEvents(operativo.getUncommittedChanges()));
    }

}

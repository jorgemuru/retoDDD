package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.DDDReto.Domain.Dotacion.commands.CrearDotacion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearDotacionUseCase extends UseCase<RequestCommand<CrearDotacion>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CrearDotacion> crearDotacionRequestCommand) {
        var command = crearDotacionRequestCommand.getCommand();

            var dotacion = new Dotacion(command.getEntityId(), command.getName(), command.getObservaciones());

        emit().onResponse(new ResponseEvents(dotacion.getUncommittedChanges()));
    }

}

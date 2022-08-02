package co.com.sofka.DDDReto.Domain.Dotacion.UseCases;
import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.DDDReto.Domain.Dotacion.commands.crearDotacion;

public class CrearDotacionUseCase extends UseCase<RequestCommand<crearDotacion>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<crearDotacion> crearDotacionRequestCommand) {
        var command = crearDotacionRequestCommand.getCommand();

            var dotacion = new Dotacion(command.getEntityId(), command.getName(), command.getObservaciones());

        emit().onResponse(new ResponseEvents(dotacion.getUncommittedChanges()));
    }

}

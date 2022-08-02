package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.DDDReto.Domain.Dotacion.commands.ActualizarPolicia;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class actualizarPoliciaUseCase extends UseCase<RequestCommand<ActualizarPolicia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarPolicia> actualizarPoliciaRequestCommand) {
        var command = actualizarPoliciaRequestCommand.getCommand();
        Dotacion dotacion = Dotacion.from(command.getDotacionId(), repository().
                getEventsBy(command.getDotacionId().value()));

        dotacion.actualizarPolicia(command.getDotacionId(), command.getDocumento(), command.getNombre(),
                command.getGrado(), command.getImplemento(), command.getRol());

        emit().onResponse(new ResponseEvents(dotacion.getUncommittedChanges()));
    }
}

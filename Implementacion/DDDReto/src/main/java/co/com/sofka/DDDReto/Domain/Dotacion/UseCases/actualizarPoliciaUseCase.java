package co.com.sofka.DDDReto.Domain.Dotacion.UseCases;

import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.DDDReto.Domain.Dotacion.commands.actualizarPolicia;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class actualizarPoliciaUseCase extends UseCase<RequestCommand<actualizarPolicia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<actualizarPolicia> actualizarPoliciaRequestCommand) {
        var command = actualizarPoliciaRequestCommand.getCommand();
        Dotacion dotacion = Dotacion.from(command.getDotacionId(), repository().
                getEventsBy(command.getDotacionId().value()));

        dotacion.actualizarPolicia(command.getDotacionId(), command.getDocumento(), command.getNombre(),
                command.getGrado(), command.getImplemento(), command.getRol());

        emit().onResponse(new ResponseEvents(dotacion.getUncommittedChanges()));
    }
}

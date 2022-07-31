package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.DDDReto.Domain.Dotacion.commands.crearPolicia;

public class crearPoliciaUseCase extends UseCase<RequestCommand<crearPolicia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<crearPolicia> crearPoliciaRequestCommand) {
        var command = crearPoliciaRequestCommand.getCommand();
        Dotacion dotacion = Dotacion.from(command.getDotacionId(), repository().
                getEventsBy(command.getDotacionId().value()));

        dotacion.crearPolicia(dotacion.getName(), command.getDocumento(), command.getNombre(),
                command.getGrado(), command.getImplemento(), command.getRol());

        emit().onResponse(new ResponseEvents(dotacion.getUncommittedChanges()));
    }
}

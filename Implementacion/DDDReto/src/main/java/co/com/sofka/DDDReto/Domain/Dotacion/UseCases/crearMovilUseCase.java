package co.com.sofka.DDDReto.Domain.Dotacion.UseCases;

import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.DDDReto.Domain.Dotacion.commands.crearMovil;

public class crearMovilUseCase extends UseCase<RequestCommand<crearMovil>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<crearMovil> crearMovilRequestCommand) {
        var command = crearMovilRequestCommand.getCommand();
        Dotacion dotacion = Dotacion.from(command.getDotacionId(), repository().
                getEventsBy(command.getDotacionId().value()));

        dotacion.crearMovil(command.getName(), command.getMaricula(), command.getTipo(),
                command.getMarca(), command.getImplemento(), command.getModelo());

        emit().onResponse(new ResponseEvents(dotacion.getUncommittedChanges()));
    }
}

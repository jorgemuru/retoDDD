package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Operativo.Operativo;
import co.com.sofka.DDDReto.Domain.Operativo.commands.CrearLugar;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearLugarUseCase extends UseCase<RequestCommand<CrearLugar>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearLugar> CrearLugarRequestCommand) {
        var command = CrearLugarRequestCommand.getCommand();
        Operativo operativo = Operativo.from(command.getEntityId(), repository().
                getEventsBy(command.getEntityId().value()));
        operativo.crearLugar(command.getName(), command.getRuta(), command.getKilometro(),
                command.getCiudad(), command.getDepartamento());

        emit().onResponse(new ResponseEvents(operativo.getUncommittedChanges()));
    }
}

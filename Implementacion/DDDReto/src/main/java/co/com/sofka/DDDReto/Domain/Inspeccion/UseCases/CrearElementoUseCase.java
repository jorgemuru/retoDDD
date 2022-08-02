package co.com.sofka.DDDReto.Domain.Inspeccion.UseCases;

import co.com.sofka.DDDReto.Domain.Inspeccion.Inspeccion;
import co.com.sofka.DDDReto.Domain.Inspeccion.commands.CrearElemento;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearElementoUseCase extends UseCase<RequestCommand<CrearElemento>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearElemento> CrearElementoRequestCommand) {
        var command = CrearElementoRequestCommand.getCommand();
        Inspeccion inspeccion = Inspeccion.from(command.getInspeccionId(), repository().
                getEventsBy(command.getInspeccionId().value()));
        inspeccion.crearElemento(command.getName(), command.getNombreElemento(), command.getDescripcion(),
                command.getTipo(), command.getNumeroSerie());

        emit().onResponse(new ResponseEvents(inspeccion.getUncommittedChanges()));
    }
}

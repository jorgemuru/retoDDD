package co.com.sofka.DDDReto.Domain.Inspeccion.UseCases;

import co.com.sofka.DDDReto.Domain.Inspeccion.Inspeccion;
import co.com.sofka.DDDReto.Domain.Inspeccion.commands.CrearPersona;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearPersonaUseCase extends UseCase<RequestCommand<CrearPersona>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPersona> CrearPersonaRequestCommand) {
        var command = CrearPersonaRequestCommand.getCommand();
        Inspeccion inspeccion = Inspeccion.from(command.getInspeccionId(), repository().
                getEventsBy(command.getInspeccionId().value()));
        inspeccion.crearPersona(command.getName(), command.getNombrePersona(), command.getEdad(),
                command.getNacionalidad(), command.getDomicilio(), command.getDocumento(), command.getRol());

        emit().onResponse(new ResponseEvents(inspeccion.getUncommittedChanges()));
    }
}

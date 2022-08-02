package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Operativo.Operativo;
import co.com.sofka.DDDReto.Domain.Operativo.commands.CrearInforme;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearInformeUseCase extends UseCase<RequestCommand<CrearInforme>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearInforme> CrearInformeRequestCommand) {
        var command = CrearInformeRequestCommand.getCommand();
        Operativo operativo = Operativo.from(command.getEntityId(), repository().
                getEventsBy(command.getEntityId().value()));
        operativo.crearInforme(command.getName(), command.getTitulo(), command.getSubtitulo(),
                command.getNarracion(), command.getAutor(), command.getNumeroevento());

        emit().onResponse(new ResponseEvents(operativo.getUncommittedChanges()));
    }
}

package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Operativo.Operativo;
import co.com.sofka.DDDReto.Domain.Operativo.commands.RemoverOperativo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class RemoverOperativoUseCase extends UseCase<RequestCommand<RemoverOperativo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<RemoverOperativo> RemoverOperativoRequestCommand) {
        var command = RemoverOperativoRequestCommand.getCommand();
        Operativo operativo = Operativo.from(command.getOperativoId(), repository().
                getEventsBy(command.getOperativoId().value()));
        operativo.removerOperativo(command.getOperativoId());
        emit().onResponse(new ResponseEvents(operativo.getUncommittedChanges()));
    }
}

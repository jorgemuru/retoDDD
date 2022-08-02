package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Inspeccion.Inspeccion;
import co.com.sofka.DDDReto.Domain.Inspeccion.commands.CrearVehiculo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearVehiculoUseCase extends UseCase<RequestCommand<CrearVehiculo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearVehiculo> CrearVehiculoRequestCommand) {
        var command = CrearVehiculoRequestCommand.getCommand();
        Inspeccion inspeccion = Inspeccion.from(command.getInspeccionId(), repository().
                getEventsBy(command.getInspeccionId().value()));
        inspeccion.crearVehiculo(command.getName(), command.getMarca(), command.getModelo(), command.getColor(),
                command.getAnio(), command.getMatricula(), command.getTipo(), command.getPropietario());

        emit().onResponse(new ResponseEvents(inspeccion.getUncommittedChanges()));
    }
}

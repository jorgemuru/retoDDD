package co.com.sofka.DDDReto.Business.UseCases;

import co.com.sofka.DDDReto.Domain.Dotacion.Events.DotacionCreada;
import co.com.sofka.DDDReto.Domain.Dotacion.Values.*;
import co.com.sofka.DDDReto.Domain.Dotacion.commands.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrearDotacionUseCaseTest {
private CrearDotacionUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase = new CrearDotacionUseCase();
    }

    @Test
    public void crearDotacion(){

        //Arrange
        DotacionId dotacionId = DotacionId.of("AA1");
        Name name = new Name("DotacionPrueba");
        Observaciones observaciones = new Observaciones("");

        var command = new CrearDotacion(dotacionId, name, observaciones);

        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Asserts
        var dotacionCreada = (DotacionCreada)events.get(0);
        Assertions.assertEquals("AA1", dotacionCreada.aggregateRootId());
        Assertions.assertEquals("DotacionPrueba", dotacionCreada.getName().value());
        Assertions.assertEquals("", dotacionCreada.getObservaciones());
    }
}
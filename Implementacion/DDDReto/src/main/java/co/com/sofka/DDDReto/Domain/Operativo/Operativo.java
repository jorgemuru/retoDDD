package co.com.sofka.DDDReto.Domain.Operativo;
import co.com.sofka.DDDReto.Domain.Dotacion.Dotacion;
import co.com.sofka.DDDReto.Domain.Inspeccion.Events.ElementoCreado;
import co.com.sofka.DDDReto.Domain.Inspeccion.Events.InspeccionCreada;
import co.com.sofka.DDDReto.Domain.Inspeccion.Inspeccion;
import co.com.sofka.DDDReto.Domain.Inspeccion.InspeccionChange;
import co.com.sofka.DDDReto.Domain.Inspeccion.Values.*;
import co.com.sofka.DDDReto.Domain.Operativo.Entities.*;
import co.com.sofka.DDDReto.Domain.Operativo.Events.InformeCreado;
import co.com.sofka.DDDReto.Domain.Operativo.Events.LugarCreado;
import co.com.sofka.DDDReto.Domain.Operativo.Events.OperativoCreado;
import co.com.sofka.DDDReto.Domain.Operativo.Events.OperativoRemovido;
import co.com.sofka.DDDReto.Domain.Operativo.Values.Name;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Operativo extends AggregateEvent<OperativoId>{
    protected Name name;
    protected Set<Lugar> lugarSet;
    protected Set<Informe> informeSet;
    protected Set<Inspeccion> inspeccionSet;
    protected Set<Dotacion> dotacionSet;

    public Name getName() {
        return name;
    }
    public Operativo(OperativoId entityId)
    {
        super(entityId);
        subscribe(new OperativoChange(this));
    }

    public Operativo(OperativoId entityId, Name name, Fecha fecha, Hora hora,
                     Objetivo objetivo, Observaciones observaciones) {
        super(entityId);
        appendChange(new OperativoCreado(name, fecha, hora, objetivo, observaciones)).apply();
    }
    public static Operativo from(OperativoId operativoId, List<DomainEvent> domainEvents) {
        Operativo operativo = new Operativo(operativoId);
        domainEvents.forEach(operativo::applyEvent);
        return operativo;
    }

    //Eventos
    public void crearLugar(Name name, Ruta ruta, Kilometro kilometro,
                           Ciudad ciudad, Departamento departamento){
        LugarId lugarId  = new LugarId();
        appendChange(new LugarCreado(lugarId, name, ruta,  kilometro, ciudad, departamento)).apply();
    }
    public void crearInforme(Name name, Titulo titulo, SubTitulo subtitulo, Narracion narracion,
                             Autor autor, NumeroEvento numeroevento){
        InformeId informeId  = new InformeId();
        appendChange(new InformeCreado(informeId, name, titulo, subtitulo, narracion,
                autor, numeroevento)).apply();
    }
    public void removerOperativo(OperativoId operativoId){
        appendChange(new OperativoRemovido(operativoId)).apply();
    }


}//fin clase
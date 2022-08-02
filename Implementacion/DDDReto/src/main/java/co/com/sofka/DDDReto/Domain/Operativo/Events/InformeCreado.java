package co.com.sofka.DDDReto.Domain.Operativo.Events;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class InformeCreado extends DomainEvent{
    private final  InformeId informeId;
    private final Name name;
    private final Titulo titulo;
    private final SubTitulo subtitulo;
    private final Narracion narracion;
    private final Autor autor;
    private final NumeroEvento numeroevento;

    public InformeCreado(InformeId informeId, Name name, Titulo titulo, SubTitulo subtitulo, Narracion narracion,
                         Autor autor, NumeroEvento numeroevento) {
        super("co.com.sofka.DDDReto.Domain.Operativo.informeCreado");
        this.informeId = informeId;
        this.name = name;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.narracion = narracion;
        this.autor = autor;
        this.numeroevento = numeroevento;
    }

    public InformeId getInformeId() {
        return informeId;
    }

    public Name getName() {
        return name;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public SubTitulo getSubtitulo() {
        return subtitulo;
    }

    public Narracion getNarracion() {
        return narracion;
    }

    public Autor getAutor() {
        return autor;
    }

    public NumeroEvento getNumeroevento() {
        return numeroevento;
    }
}

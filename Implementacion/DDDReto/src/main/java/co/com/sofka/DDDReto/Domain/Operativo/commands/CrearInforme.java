package co.com.sofka.DDDReto.Domain.Operativo.commands;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.DDDReto.Domain.Operativo.Values.*;

public class CrearInforme extends Command{
    private final OperativoId entityId;
    private final Name name;
    private final Titulo titulo;
    private final SubTitulo subtitulo;
    private final Narracion narracion;
    private final Autor autor;
    private final NumeroEvento numeroevento;

    public CrearInforme(OperativoId entityId, Name name, Titulo titulo, SubTitulo subtitulo,
                        Narracion narracion, Autor autor, NumeroEvento numeroevento) {
        this.entityId = entityId;
        this.name = name;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.narracion = narracion;
        this.autor = autor;
        this.numeroevento = numeroevento;
    }

    public OperativoId getEntityId() {
        return entityId;
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

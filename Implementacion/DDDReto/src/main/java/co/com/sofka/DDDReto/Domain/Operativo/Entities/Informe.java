package co.com.sofka.DDDReto.Domain.Operativo.Entities;

import co.com.sofka.DDDReto.Domain.Operativo.Values.*;
import co.com.sofka.domain.generic.Entity;

public class Informe extends Entity<InformeId> {
    private Titulo titulo;
    private SubTitulo subtitulo;
    private Narracion narracion;
    private Autor autor;
    private NumeroEvento numeroevento;

    public Informe(InformeId entityId, Titulo titulo, SubTitulo subtitulo, Narracion narracion,
                   Autor autor, NumeroEvento numeroevento) {
        super(entityId);
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.narracion = narracion;
        this.autor = autor;
        this.numeroevento = numeroevento;
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

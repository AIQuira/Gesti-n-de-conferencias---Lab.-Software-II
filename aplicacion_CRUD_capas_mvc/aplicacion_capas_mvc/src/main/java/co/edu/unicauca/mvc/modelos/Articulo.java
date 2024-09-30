package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;
import java.util.List;

public class Articulo {

    private int idArticulo;
    private String titulo;
    private String autores;
    private EstadoRevision estadoRevision;

    private Conferencia objConferencia;
    private Revisor revisor;

    public Articulo(String titulo, String autores) {
        this.titulo = titulo;
        this.autores = autores;
        this.estadoRevision = estadoRevision.PENDIENTE; // Estado inicial
    }

    public void setEstadoRevision(EstadoRevision estadoRevision) {
        this.estadoRevision = estadoRevision;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }

    public Revisor getRevisor() {
        return revisor;
    }

    public void setRevisor(Revisor revisor) {
        this.revisor = revisor;
    }

    public EstadoRevision getEstadoRevision() {
        return estadoRevision;
    }
}
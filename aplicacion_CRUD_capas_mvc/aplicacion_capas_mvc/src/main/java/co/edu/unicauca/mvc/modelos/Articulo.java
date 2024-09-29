package co.edu.unicauca.mvc.modelos;

public class Articulo {

    private int idArticulo;
    private String titulo;
    private String autores;
    private boolean revisado;

    private Conferencia objConferencia;

    public Articulo() {

    }

    public Articulo(int idArticulo, String titulo, String autores, Conferencia conferencia) {
        this.idArticulo = idArticulo;
        this.titulo = titulo;
        this.autores = autores;
        this.objConferencia = conferencia;
        this.revisado = false;
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

    public boolean isRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

}

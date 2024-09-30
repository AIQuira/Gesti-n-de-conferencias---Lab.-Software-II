package co.edu.unicauca.mvc.modelos;

import java.util.ArrayList;

public class Revisor {

    private int idRevisor;
    private String nombres;
    private String apellidos;

    private ArrayList<Articulo> articulosAsignados;

    public Revisor() {

    }

    public Revisor(int idRevisor, String nombres, String apellidos) {
        this.idRevisor = idRevisor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.articulosAsignados = new ArrayList<>();
    }

    public int getIdRevisor() {
        return idRevisor;
    }

    public void setIdRevisor(int idRevisor) {
        this.idRevisor = idRevisor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Articulo> getArticulosAsignados() {
        return articulosAsignados;
    }

    public void setArticulosAsignados(ArrayList<Articulo> articulosAsignados) {
        this.articulosAsignados = articulosAsignados;
    }

    public boolean asignarArticulo(Articulo articulo) {
        return articulosAsignados.add(articulo);
    }
    
    @Override
    public String toString(){
        return this.nombres + this.apellidos;
    }

}

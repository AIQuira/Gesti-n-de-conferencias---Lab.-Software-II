package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioArticulo;
import co.edu.unicauca.mvc.infraestructura.Subject;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.EstadoRevision;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;


public class ServicioAlmacenamientoArticulos extends Subject{
    private InterfaceRepositorioArticulo referenciaRepositorioArticulo;
    
    public ServicioAlmacenamientoArticulos(InterfaceRepositorioArticulo referenciaRepositorioArticulo)
    {
        this.referenciaRepositorioArticulo=referenciaRepositorioArticulo;
    }
    
    public boolean almacenarArticulo(Articulo objArticulo)
    {
        return this.referenciaRepositorioArticulo.almacenarArticulo(objArticulo);
    }
      
    public List<Articulo> listarArticulos()
    {
        return this.referenciaRepositorioArticulo.listarArticulos();
    }
    
    public boolean eliminarArticulo(int idArticulo)
    {
        return this.referenciaRepositorioArticulo.eliminarArticulo(idArticulo);
    }
    
    public Articulo consultarArticulo(int idArticulo)
    {
        return this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
    }
    
    public boolean actualizarArticulo(Articulo objArticulo)
    {
        return this.referenciaRepositorioArticulo.actualizarArticulo(objArticulo);
    }
    // Método para cambiar el estado de revisión del artículo
    public void cambiarEstadoArticulo(String tituloArticulo, EstadoRevision nuevoEstado) {
        for (Articulo articulo : listarArticulos()) {
            if (articulo.getTitulo().equals(tituloArticulo)) {
                articulo.setEstadoRevision(nuevoEstado);
                notifyAllObserves(); // Notificar cuando cambie el estado
                break;
            }
        }
    }
    
    public boolean asignarRevisorArticulo (int idArticulo, Revisor objRevisor){
        Articulo articulo = this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
        if (articulo != null) {
            if (articulo.getRevisor() == null) { // Verificar si no tiene revisor asignado
                articulo.setRevisor(objRevisor); // Asignar el revisor
                return true; // Éxito
            } else {
                // Manejar el caso en el que ya tiene un revisor asignado
                System.out.println("El artículo ya tiene un revisor asignado.");
                return false; // Fallo en la asignación
            }
        }
        return false;
    }
}
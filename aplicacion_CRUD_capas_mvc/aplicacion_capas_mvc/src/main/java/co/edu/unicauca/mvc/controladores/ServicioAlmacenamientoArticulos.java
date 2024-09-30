package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioArticulo;
import co.edu.unicauca.mvc.infraestructura.Subject;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.ArticuloReview;
import co.edu.unicauca.mvc.modelos.EstadoRevision;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioAlmacenamientoArticulos extends Subject {

    private InterfaceRepositorioArticulo referenciaRepositorioArticulo;
    private Map<Articulo, List<ArticuloReview>> revisionesPorArticulo = new HashMap<>();

    public ServicioAlmacenamientoArticulos(InterfaceRepositorioArticulo referenciaRepositorioArticulo) {
        this.referenciaRepositorioArticulo = referenciaRepositorioArticulo;
    }

    public boolean almacenarArticulo(Articulo objArticulo) {
        return this.referenciaRepositorioArticulo.almacenarArticulo(objArticulo);
    }

    public List<Articulo> listarArticulos() {
        return this.referenciaRepositorioArticulo.listarArticulos();
    }

    public boolean eliminarArticulo(int idArticulo) {
        return this.referenciaRepositorioArticulo.eliminarArticulo(idArticulo);
    }

    public Articulo consultarArticulo(int idArticulo) {
        return this.referenciaRepositorioArticulo.consultarArticulo(idArticulo);
    }

    public boolean actualizarArticulo(Articulo objArticulo) {
        return this.referenciaRepositorioArticulo.actualizarArticulo(objArticulo);
    }

    // Método para cambiar el estado de revisión del artículo
    public boolean cambiarEstadoArticulo(int idArticulo, EstadoRevision nuevoEstado) {
        Articulo articulo = consultarArticulo(idArticulo);  // Consultar artículo por ID

        if (articulo != null && articulo.cambiarEstado(nuevoEstado)) {
            // Actualizar el estado en la base de datos o en la lógica de tu aplicación
            referenciaRepositorioArticulo.actualizarArticulo(articulo);  // Persistir los cambios
            notifyAllObserves();
            return true;
        } else {
            System.out.println("No se pudo cambiar el estado del artículo.");
            return false; // Si la transición no es válida
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
    
    public void agregarRevisionArticulo(Articulo articulo, ArticuloReview revision) {
        revisionesPorArticulo.putIfAbsent(articulo, new ArrayList<>());
        revisionesPorArticulo.get(articulo).add(revision);
    }
    
    public List<ArticuloReview> obtenerRevisionesArticulo(Articulo articulo) {
        return revisionesPorArticulo.getOrDefault(articulo, new ArrayList<>());
    }
}

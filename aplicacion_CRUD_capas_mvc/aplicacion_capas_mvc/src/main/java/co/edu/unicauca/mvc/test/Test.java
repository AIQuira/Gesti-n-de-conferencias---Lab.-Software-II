package co.edu.unicauca.mvc.test;

import co.edu.unicauca.mvc.accesoADatos.RepositorioArticuloMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioConferenciaMemoriaArrayList;
import co.edu.unicauca.mvc.accesoADatos.RepositorioRevisorMemoriaArrayList;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoConferencias;
import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoRevisor;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Revisor;
import co.edu.unicauca.mvc.modelos.EstadoRevision;
import co.edu.unicauca.mvc.vistas.adminConferencia.VtnPrincipalAdmin;
import co.edu.unicauca.mvc.vistas.asistente.VtnPrincipalAsistente;
import co.edu.unicauca.mvc.vistas.autorPublicacion.VtnPrincipalAutor;
import javax.swing.UIManager;

/**
 * Clase de prueba para ejecutar la aplicación de gestión de artículos, conferencias y revisores.
 * Esta clase inicializa los repositorios, servicios y vistas de la aplicación, 
 * además de simular el flujo de trabajo entre los diferentes componentes.
 * 
 * @author 
 */
public class Test {

    /**
     * Método principal que inicia la aplicación.
     * Configura el aspecto visual y crea instancias de los repositorios, servicios y vistas necesarias.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        
        seleccionarLookAndField();
        
        // Inicializa el repositorio y el servicio de conferencias.
        RepositorioConferenciaMemoriaArrayList objRepositorio1 = new RepositorioConferenciaMemoriaArrayList();
        ServicioAlmacenamientoConferencias objServicio1 = new ServicioAlmacenamientoConferencias(objRepositorio1);
        
        // Inicializa el repositorio y el servicio de artículos.
        RepositorioArticuloMemoriaArrayList objRepositorio2 = new RepositorioArticuloMemoriaArrayList();
        ServicioAlmacenamientoArticulos objServicio2 = new ServicioAlmacenamientoArticulos(objRepositorio2);
        
        // Inicializa el repositorio y el servicio de revisores.
        RepositorioRevisorMemoriaArrayList objRepositorio3 = new RepositorioRevisorMemoriaArrayList();
        ServicioAlmacenamientoRevisor objServicio3 = new ServicioAlmacenamientoRevisor(objRepositorio3);
        
        // Crea revisores y los asigna como observadores del servicio de artículos.
        Revisor revisor1 = new Revisor(1, "Revisor 1", "a 1");
        Revisor revisor2 = new Revisor(2, "Revisor 2", "b 2");
        objServicio2.addObserver(revisor1);
        objServicio2.addObserver(revisor2);
        
        // Crea artículos y los almacena en el servicio.
        Articulo articulo1 = new Articulo("Artículo 1", "w");
        Articulo articulo2 = new Articulo("Artículo 2", "s");
        objServicio2.almacenarArticulo(articulo1);
        objServicio2.almacenarArticulo(articulo2);
        
        // Cambia el estado de los artículos.
        objServicio2.cambiarEstadoArticulo(1, EstadoRevision.EN_REVISION);
        objServicio2.cambiarEstadoArticulo(2, EstadoRevision.EN_REVISION);
        
        // Inicializa las vistas para asistente, autor y administrador.
        VtnPrincipalAsistente objVtnAsistente = new VtnPrincipalAsistente();
        VtnPrincipalAutor objVtnAutor = new VtnPrincipalAutor();
        
        // Asocia las vistas con el servicio de conferencias.
        objServicio1.addObserver(objVtnAsistente);
        objServicio1.addObserver(objVtnAutor);
        
        VtnPrincipalAdmin objVtnPrincipal = new VtnPrincipalAdmin();    
        objVtnPrincipal.asociarServios(objServicio1, objServicio2, objServicio3);
        
        // Almacena revisores en el servicio de revisores.
        Revisor revisorPrueba = new Revisor(1, "Juan", "Perez");
        objServicio3.almacenarRevisor(revisorPrueba);
        Revisor revisorPrueba1 = new Revisor(2, "Pablo", "Gomez");
        objServicio3.almacenarRevisor(revisorPrueba1);
        Revisor revisorPrueba2 = new Revisor(3, "Ana", "Lopez");
        objServicio3.almacenarRevisor(revisorPrueba2);
        Revisor revisorPrueba3 = new Revisor(4, "Maria", "Santos");
        objServicio3.almacenarRevisor(revisorPrueba3);
        
        // Muestra las ventanas de las vistas.
        objVtnPrincipal.setVisible(true);
        objVtnAsistente.setVisible(true);
        objVtnAutor.setVisible(true);
    }
    
    /**
     * Selecciona el Look and Feel de la interfaz de usuario.
     * Configura el aspecto visual de la aplicación según las preferencias del usuario.
     */
    private static void seleccionarLookAndField() {
        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName()))
                try {
                    UIManager.setLookAndFeel(laf.getClassName());
                } catch (Exception ex) {
                    // Manejo de excepciones de configuración del Look and Feel.
                }
        }
    }
}

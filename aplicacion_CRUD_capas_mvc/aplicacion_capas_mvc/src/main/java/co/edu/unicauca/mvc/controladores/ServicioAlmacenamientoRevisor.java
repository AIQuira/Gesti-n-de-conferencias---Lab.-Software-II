package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioRevisor;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

public class ServicioAlmacenamientoRevisor {

    private InterfaceRepositorioRevisor referenciaRepositorioRevisor;

    public ServicioAlmacenamientoRevisor(InterfaceRepositorioRevisor referenciaRepositorioRevisor) {
        this.referenciaRepositorioRevisor = referenciaRepositorioRevisor;
    }

    public boolean almacenarRevisor(Revisor objRevisor) {
        return this.referenciaRepositorioRevisor.almacenarRevisor(objRevisor);
    }

    public List<Revisor> listarRevisores() {
        return this.referenciaRepositorioRevisor.listarRevisores();
    }

    public boolean eliminarRevisor(int idRevisor) {
        return this.referenciaRepositorioRevisor.eliminarRevisor(idRevisor);
    }

    public Revisor consultarRevisor(int idRevisor) {
        return this.referenciaRepositorioRevisor.consultarRevisor(idRevisor);
    }

    public boolean actualizarRevisor(Revisor objRevisor) {
        return this.referenciaRepositorioRevisor.actualizarRevisor(objRevisor);
    }
}

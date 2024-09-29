package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

public interface InterfaceRepositorioRevisor {
    
    public boolean almacenarRevisor(Revisor objRevisor);
    public List<Revisor> listarRevisores();
    public boolean eliminarRevisor (int idRevisor);
    public Revisor consultarRevisor (int idRevisor);
    public boolean actualizarRevisor (Revisor objRevisor);
    
}

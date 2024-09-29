package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Conferencia;
import co.edu.unicauca.mvc.modelos.Revisor;
import java.util.List;

public interface InterfaceRepositorioConferencia {
    public boolean almacenarConferencia(Conferencia objConferencia);
    public List<Conferencia> listarConferencias();
}

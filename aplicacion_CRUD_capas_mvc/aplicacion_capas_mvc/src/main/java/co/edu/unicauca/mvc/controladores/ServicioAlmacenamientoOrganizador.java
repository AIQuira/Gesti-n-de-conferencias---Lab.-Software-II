package co.edu.unicauca.mvc.controladores;

import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioOrganizador;
import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.List;

public class ServicioAlmacenamientoOrganizador {
    
    private InterfaceRepositorioOrganizador referenciaRepositorioOrganizador;
    
    public ServicioAlmacenamientoOrganizador(InterfaceRepositorioOrganizador referenciaRepositorioOrganizador) {
        this.referenciaRepositorioOrganizador = referenciaRepositorioOrganizador;
    }
    
    public boolean almacenarOrganizador(Organizador objOrganizador)
    {
        return this.referenciaRepositorioOrganizador.registrarOrganizador(objOrganizador);
    }
      
    public List<Organizador> listarOrganizador()
    {
        return this.referenciaRepositorioOrganizador.listarOrganizadores();
    }
}

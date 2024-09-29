package co.edu.unicauca.mvc.accesoADatos;

import co.edu.unicauca.mvc.modelos.Organizador;
import java.util.ArrayList;
import java.util.List;

public class RepositorioOrganizadorMemoriaArrayList implements InterfaceRepositorioOrganizador{
    
    private ArrayList<Organizador> listaOrganizadores;

    @Override
    public boolean registrarOrganizador(Organizador objOrganizador) {
        boolean bandera = this.listaOrganizadores.add(objOrganizador);
        return bandera;
    }

    @Override
    public List<Organizador> listarOrganizadores() {
        return this.listaOrganizadores;
    }
    
}

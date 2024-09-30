package co.edu.unicauca.microkernel.commo.entities;

/**
 * Clase que representa la configuración del correo electrónico.
 * Esta clase contiene la información necesaria para autenticar y configurar el acceso a una cuenta de correo.
 * 
 * @author thali
 */
public class EmailConfig {
    private String username = "thaliaepe@hotmail.com"; // Cuenta de Hotmail
    private String password = "carolt12345"; // Contraseña de Hotmail

    /**
     * Constructor que inicializa la configuración del correo electrónico.
     * 
     * @param username El nombre de usuario de la cuenta de correo.
     * @param password La contraseña de la cuenta de correo.
     */
    public EmailConfig(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Obtiene el nombre de usuario de la cuenta de correo.
     * 
     * @return El nombre de usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario de la cuenta de correo.
     * 
     * @param username El nuevo nombre de usuario.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene la contraseña de la cuenta de correo.
     * 
     * @return La contraseña.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña de la cuenta de correo.
     * 
     * @param password La nueva contraseña.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}


package co.edu.unicauca.microkernel.commo.entities;

/**
 *
 * @author thali
 */
public class EmailConfig {
    private String username = "pruebalina25@hotmail.com"; // Tu cuenta de Hotmail
    private String password = "redire25"; // Tu contraseña de Hotmail

    public EmailConfig(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

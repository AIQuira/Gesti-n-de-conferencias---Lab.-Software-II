
package co.edu.unicauca.mvc.plugins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import co.edu.unicauca.mvc.plugins.EmailPlugin;
import static java.lang.ProcessBuilder.Redirect.to;
import java.util.Properties;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author thali
 */
public class envioEmailTest {
    
    
       private EmailPlugin emailPlugin;
    
    @BeforeEach
    void setUp() {
        String username = "conferenciasunicauca@hotmail.com"; // Tu cuenta de Hotmail
        String password = "proyecto.software"; // Tu contraseña de Hotmail
        
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp-mail.outlook.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        
        emailPlugin = new EmailPlugin(username, password, properties);
    }

    @Test
    void testSendEmail() {
        String to = "thaliaepe@hotmail.com"; // Cambia a la dirección de correo de destino
        String subject = "CONFIRMACION Y NOTIFICACION RECEPCION TRABAJO";
        String body = "El trabajo ha sido recibido de manera exitosa";
        
        // Envía el correo real
        emailPlugin.sendEmail(to, subject, body);
        
        
        System.out.println("Correo enviado correctamente a " + to);
    }
}
   


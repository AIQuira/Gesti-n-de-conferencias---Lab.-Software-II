
package co.edu.unicauca.microkernel.plugins.mkPlugin;

/**
 *
 * @author thali
 */
import co.edu.unicauca.microkernel.common.interfaces.ISendEmail;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class mkPlugin implements ISendEmail{

    @Override
    public void sendEmail(String username, String password, String addressee) {
   Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp-mail.outlook.com"); // Servidor SMTP de Hotmail
        prop.put("mail.smtp.port", "587"); // Puerto para TLS
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); // Habilitar TLS

        // Crear sesión con autenticación
        Session session = Session.getInstance(prop,
            new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
        
        try {
            // Crear el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(addressee) // Destinatario
            );
            message.setSubject("Advertencia de Compilación: Se generó una advertencia sobre operaciones no verificadas en RepositorioArticuloMemoriaArrayList. Puedes recompilar con la opción -Xlint:unchecked para obtener más detalles sobre esta advertencia.");
            message.setText("Compilación Exitosa: El proyecto aplicacion_capas_mvc se construyó correctamente y se generó el archivo JAR.");

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("Correo enviado correctamente");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

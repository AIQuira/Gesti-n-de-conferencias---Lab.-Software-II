package co.edu.unicauca.mvc.plugins;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Clase que gestiona el envío de correos electrónicos utilizando un servidor SMTP.
 * Este plugin permite enviar correos desde una cuenta de Hotmail/Outlook.
 * 
 * @author thali
 */
public class EmailPlugin {

    /**
     * Constructor de la clase EmailPlugin.
     * 
     * @param username Nombre de usuario (dirección de correo) desde donde se enviarán los correos.
     * @param password Contraseña del correo.
     * @param properties Propiedades de configuración del servidor SMTP.
     */
    public EmailPlugin(String username, String password, Properties properties) {
    }

    /**
     * Método que envía un correo electrónico.
     * Utiliza la cuenta configurada para enviar un correo a una dirección específica.
     * 
     * @param to Dirección de correo del destinatario.
     * @param subject Asunto del correo.
     * @param body Cuerpo del correo (contenido del mensaje).
     */
    public static void sendEmail(String to, String subject, String body) {
        final String username = "thaliaepe@hotmail.com"; // Tu cuenta de Hotmail
        final String password = "carolt12345"; // Tu contraseña de Hotmail
        
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
                InternetAddress.parse(to) // Destinatario
            );
            message.setSubject(subject); // Asunto del correo
            message.setText(body); // Cuerpo del correo

            // Enviar el mensaje
            Transport.send(message);

            System.out.println("Correo enviado correctamente");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

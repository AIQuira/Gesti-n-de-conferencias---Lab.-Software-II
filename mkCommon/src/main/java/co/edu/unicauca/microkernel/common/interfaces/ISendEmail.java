package co.edu.unicauca.microkernel.common.interfaces;

/**
 * Interfaz que define el contrato para el envío de correos electrónicos.
 * Cualquier clase que implemente esta interfaz deberá proporcionar
 * una implementación del método para enviar correos.
 * 
 * @author thali
 */
public interface ISendEmail {
    
    /**
     * Envía un correo electrónico a un destinatario específico.
     * 
     * @param username El nombre de usuario de la cuenta de correo que enviará el mensaje.
     * @param password La contraseña de la cuenta de correo que enviará el mensaje.
     * @param addressee La dirección de correo electrónico del destinatario.
     */
    void sendEmail(String username, String password, String addressee);
}

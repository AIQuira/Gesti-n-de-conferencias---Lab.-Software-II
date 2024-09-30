package co.edu.unicauca.mvc.plugins;

import co.edu.unicauca.microkernel.common.interfaces.ISendEmail;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gestor de plugins para el envío de correos electrónicos.
 * Esta clase administra los plugins para diferentes servicios de envío de correos electrónicos 
 * basados en un código específico.
 * 
 * @author thali
 */
public class EmailSenderPluginManager {
    
    public static final String FILE_NAME = "plugin.properties";
    private static EmailSenderPluginManager instance;
    private Properties pluginProperties;

    /**
     * Constructor privado para implementar el patrón Singleton.
     * Carga las propiedades del plugin desde un archivo de configuración.
     */
    private EmailSenderPluginManager() {
        pluginProperties = new Properties();
    }

    /**
     * Obtiene la instancia única de la clase EmailSenderPluginManager.
     * 
     * @return La instancia única de EmailSenderPluginManager.
     */
    public static EmailSenderPluginManager getInstance() {
        return instance;
    }

    /**
     * Inicializa el gestor de plugins con las propiedades del archivo de configuración.
     * 
     * @param basePath Ruta base donde se encuentra el archivo de configuración.
     * @throws Exception Si no se puede inicializar correctamente.
     */
    public static void init(String basePath) throws Exception {
        instance = new EmailSenderPluginManager();
        instance.loadProperties(basePath);
        if (instance.pluginProperties.isEmpty()) {
            throw new Exception("No ha sido posible inicializar los plugins.");
        }
    }

    /**
     * Obtiene el plugin de envío de correo correspondiente al código de correo especificado.
     * 
     * @param emailCode Código del tipo de correo (ej. "hotmail", "gmail").
     * @return El plugin de envío de correos correspondiente o null si no existe.
     */
    public ISendEmail getEmailPlugin(String emailCode) {
        
        // Verificar si existe una entrada en el archivo para el correo indicado.
        String propertyName = "email." + emailCode.toLowerCase();
        if (!pluginProperties.containsKey(propertyName)) {
            return null;
        }

        ISendEmail plugin = null;
        String pluginClassName = pluginProperties.getProperty(propertyName);

        try {
            // Cargar la clase del plugin.
            Class<?> pluginClass = Class.forName(pluginClassName);
            if (pluginClass != null) {

                // Crear un nuevo objeto del plugin.
                Object pluginObject = pluginClass.getDeclaredConstructor().newInstance();

                if (pluginObject instanceof ISendEmail) {
                    plugin = (ISendEmail) pluginObject;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException |
                 InstantiationException | NoSuchMethodException | SecurityException |
                 InvocationTargetException ex) {
            Logger.getLogger("DeliveryPluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }
        
        return plugin;
    }
    
    /**
     * Carga las propiedades de configuración de los plugins desde el archivo especificado.
     * 
     * @param basePath Ruta base donde se encuentra el archivo de configuración.
     */
    private void loadProperties(String basePath) {

        String filePath = basePath + FILE_NAME;
        try (FileInputStream stream = new FileInputStream(filePath)) {

            pluginProperties.load(stream);

        } catch (IOException ex) {
            Logger.getLogger("DeliveryPluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }
    }
}

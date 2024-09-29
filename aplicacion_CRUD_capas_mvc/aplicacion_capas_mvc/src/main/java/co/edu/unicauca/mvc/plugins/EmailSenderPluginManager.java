
package co.edu.unicauca.mvc.plugins;


import co.edu.unicauca.microkernel.mkCommon.interfaces.ISendEmail;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thali
 */


public class EmailSenderPluginManager {
    public static final String FILE_NAME = "plugin.properties";
    private static EmailSenderPluginManager instance;

    private Properties pluginProperties;

    private EmailSenderPluginManager() {
        pluginProperties = new Properties();
    }

    public static EmailSenderPluginManager getInstance() {
        return instance;
    }

    public static void init(String basePath) throws Exception {
        instance = new EmailSenderPluginManager();
        instance.loadProperties(basePath);
        if (instance.pluginProperties.isEmpty()) {
            throw new Exception("No ha sido posible inicializar los plugins.");
        }
    }

    public ISendEmail getEmailPlugin(String emailCode) {
        
        //Verificar si existe una entrada en el archivo para el país indicado.
        String propertyName = "email." + emailCode.toLowerCase();
        if (!pluginProperties.containsKey(propertyName)) {
            return null;
        }

        ISendEmail plugin = null;
        String pluginClassName = pluginProperties.getProperty(propertyName);

        try {
            Class<?> pluginClass = Class.forName(pluginClassName);
            if (pluginClass != null) {

                //Crear un nuevo objeto del plugin.
                Object pluginObject = pluginClass.getDeclaredConstructor().newInstance();

                if (pluginObject instanceof ISendEmail) {
                    plugin = (ISendEmail) pluginObject;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException ex) {
            Logger.getLogger("DeliveryPluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }
        
        return plugin;
    }
    
    private void loadProperties(String basePath) {

        String filePath = basePath + FILE_NAME;
        try (FileInputStream stream = new FileInputStream(filePath)) {

            pluginProperties.load(stream);

        } catch (IOException ex) {
            Logger.getLogger("DeliveryPluginManager").log(Level.SEVERE, "Error al ejecutar la aplicación", ex);
        }

    }
}

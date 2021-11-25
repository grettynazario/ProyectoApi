package ar.fi.uba.aninfo.proyecto.api.config;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.sun.istack.logging.Logger;

public class ConfigurationGenerator {
	private static final Logger LOGGER = Logger.getLogger(ConfigurationGenerator.class);
	private String path;

	public ConfigurationGenerator(final String path) {
		this.path = path;
	}

	public Configuration generateConfig() {
		 //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader(path))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONObject file = (JSONObject) obj;
            Configuration config = new Configuration();
            
            //Database
            JSONObject database = (JSONObject) file.get("database");
            String url = (String) database.get("url");
            String user = (String) database.get("user");
            String password = (String) database.get("password");
            
            //Server
            JSONObject server = (JSONObject) file.get("server");
            String host = (String) server.get("host");
            String port = (String) server.get("port");
            
            config.setUrl(url);
            config.setUser(user);
            config.setPassword(password);
            config.setHost(host);
            config.setPort(port);
 
            return config;
        } catch (Exception e) {
          LOGGER.warning("Error trying to parser the file. " + e.getMessage());
          return null;
        }
	}

}

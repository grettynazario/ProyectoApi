package ar.fi.uba.aninfo.proyecto.api.server;

import ar.fi.uba.aninfo.proyecto.api.config.Configuration;
import ar.fi.uba.aninfo.proyecto.api.config.ConfigurationGenerator;

public class ProyectProgram {
	
	private String path;
	private Configuration config;

	public ProyectProgram(final String path) {
		this.path = path;
	}

	public void initialize() {
		ConfigurationGenerator generator = new ConfigurationGenerator(path);
		this.config = generator.generateConfig();
		
		
	}

}

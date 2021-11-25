package ar.fi.uba.aninfo.proyecto.api.server;

public class ProyectoApplication {
	
	public static void main(String[] args) {
		
		ProyectProgram program = new ProyectProgram("configuracion.json");
		program.initialize();
	}

}

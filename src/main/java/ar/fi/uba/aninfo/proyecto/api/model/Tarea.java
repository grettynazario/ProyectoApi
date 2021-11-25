package ar.fi.uba.aninfo.proyecto.api.model;

public class Tarea {
	
	private String id;
	private String name;

	public Tarea(final String id, final String name) {
		this.setId(id);
		this.setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

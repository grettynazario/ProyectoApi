package ar.fi.uba.aninfo.proyecto.api.model;

public class Proyecto {
	
	private String id;
	private String name;
	private String lider;
	
	public Proyecto(final String id, final String name, final String lider) {
		this.setId(id);
		this.name = name;
		this.setLider(lider);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

}

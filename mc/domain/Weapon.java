package mc.domain;

public class Weapon {
	
	private int id;
	private String type;
	private String behaviour;

	public Weapon(int id, String type, String behaviour) {
		super();
		this.id = id;
		this.type = type;
		this.behaviour = behaviour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	
	
	
	
	

}

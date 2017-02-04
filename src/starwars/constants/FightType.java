package starwars.constants;

public enum FightType {

	Deathstar("Deathstar");

	private final String type;
	
	FightType(String type) {
		this.type = type;
	}
	
	public String getFightTypek() {
		return this.type;
	}
	
}

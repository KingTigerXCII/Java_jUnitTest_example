package starwars.characters;

public class Jedi {
	String lightsaber;
	String name;
	String rank;
	
	public Jedi(String name, String colorOfLightsaber) {
		this.setName(name);
		this.setLightsaber(colorOfLightsaber);
	}

	public String getLightsaber() {
		return lightsaber;
	}

	public void setLightsaber(String lightsaber) {
		this.lightsaber = lightsaber;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public void useLightsaber() {
		System.out.printf("The jedi uses his %s lightsaber -|---", this.getLightsaber());
	}
	
	public void useForce() {
		System.out.printf("Jedi %s use his magic", this.getName());
	}
}

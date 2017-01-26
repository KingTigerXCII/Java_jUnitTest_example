package starwars.models.characters;

import starwars.constants.JediRank;

public class Jedi {
	
	private String lightsaber;
	private String name;
	private JediRank rank;
	
	public Jedi(String name, String colorOfLightsaber, JediRank rank) {
		this.setName(name);
		this.setLightsaber(colorOfLightsaber);
		this.setRank(rank);
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
	
	public JediRank getRank() {
		return rank;
	}

	public void setRank(JediRank rank) {
		this.rank = rank;
	}

	public void useLightsaber() {
		System.out.printf("The jedi uses his %s lightsaber -|---", this.getLightsaber());
		System.out.println();
	}
	
	public void useForce() {
		System.out.printf("Jedi %s use his magic", this.getName());
		System.out.println();
	}
}

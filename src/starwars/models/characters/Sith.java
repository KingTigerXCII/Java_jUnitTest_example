package starwars.models.characters;

import starwars.constants.SithRank;

public class Sith {

	private String name;
	private SithRank rank;
	
	public Sith(String name, SithRank rank) {
		this.name = name;
		this.rank = rank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SithRank getRank() {
		return rank;
	}
	public void setRank(SithRank rank) {
		this.rank = rank;
	}

}

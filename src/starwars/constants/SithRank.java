package starwars.constants;

public enum SithRank {

	SITH_ACOLYTE("Sith Acolyte"),
	SITH_CRUSADER("Sith Crusader"),
	SITH_MASTER("Sith Master"),
	SITH_LORD("Sith Lord"),
	DARK_COUNCIL("Dark Council");

	private final String rank;
	
	SithRank(String rank) {
		this.rank = rank;
	}
	
	public String getJediRank() {
		return this.rank;
	}
	
}

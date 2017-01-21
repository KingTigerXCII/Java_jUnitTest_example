package starwars.constants;

public enum JediRank {
	
	JEDI_YOUNGLING("Jedi Youngling"),
	PADAWAN("Padawan"),
	JEDI_KNIGHT("Jedi Knight"),
	JEDI_MASTER("Jedi Master"),
	GRAND_MASTER("Grand Master");

	private final String rank;
	
	JediRank(String rank) {
		this.rank = rank;
	}
	
	public String getJediRank() {
		return this.rank;
	}
}

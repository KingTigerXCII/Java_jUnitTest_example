package starwars.business;

import starwars.interfaces.Fight;
import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;

public class FightOfDeathStar implements Fight {
	
	private int StormtrooperWins;
	private int jediWins;

	public void stormAgainstJedi(Stormtrooper[] stormtroopers, Jedi[] jedis) {
		
		if (jedis.length >= stormtroopers.length) {
			this.setJediWins(this.getJediWins() + 1);
		}
		else if (stormtroopers.length >= (10*jedis.length)) {
			this.setStormtrooperWins(this.getStormtrooperWins() + 1);
		}
		
		this.showResults();
	}
	
	public void showResults() {
		System.out.println("Jedi wins: " + this.getJediWins());
		System.out.println("----------------------------");
		System.out.printf("Stormtrooper wins: " + this.getStormtrooperWins());
	}

	public int getJediWins() {
		return jediWins;
	}

	private void setJediWins(int jediWins) {
		this.jediWins = jediWins;
	}

	public int getStormtrooperWins() {
		return StormtrooperWins;
	}

	private void setStormtrooperWins(int stormtrooperWins) {
		StormtrooperWins = stormtrooperWins;
	}

}

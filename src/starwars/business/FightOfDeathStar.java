package starwars.business;

import starwars.interfaces.Fight;
import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;
import starwars.output.ConsoleOutput;

public class FightOfDeathStar implements Fight {
	
	private ConsoleOutput consoleOutput = new ConsoleOutput();
	private int StormtrooperWins;
	private int jediWins;

	public void stormAgainstJedi(Stormtrooper[] stormtroopers, Jedi[] jedis) {
		
		if (jedis.length >= stormtroopers.length) {
			this.setJediWins(this.getJediWins() + 1);
			consoleOutput.jediWins();
		}
		else if (stormtroopers.length >= (10*jedis.length)) {
			this.setStormtrooperWins(this.getStormtrooperWins() + 1);
			consoleOutput.stormtrooperWins();
		}
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

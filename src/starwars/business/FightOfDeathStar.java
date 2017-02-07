package starwars.business;

import java.util.HashMap;

import starwars.interfaces.Fight;
import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;
import starwars.output.ConsoleOutput;

public class FightOfDeathStar implements Fight {
	
	private ConsoleOutput consoleOutput = new ConsoleOutput();
	private static final HashMap<String, Integer> scores = new HashMap<String, Integer>() {/**
		 * 
		 */
		private static final long serialVersionUID = -8997518799530234124L;

	{
		
		put("Jedi", 0);
		put("Sith", 0);
		put("Stormtrooper", 0);
		
	}};


	public void stormAgainstJedi(Stormtrooper[] stormtroopers, Jedi[] jedis) {
		
		if (jedis.length >= stormtroopers.length) {
			scores.put("Jedi", scores.get("Jedi") + 1);
			consoleOutput.showJediWins();
		}
		else if (stormtroopers.length >= (10*jedis.length)) {
			scores.put("Stormtrooper", scores.get("Stormtrooper") + 1);
			consoleOutput.showStormtrooperWins();
		}
	}
	
	public void showFightScore() {
		consoleOutput.showFightScore(this.getScores());
	}

	public HashMap<String, Integer> getScores() {
		return scores;
	}

}

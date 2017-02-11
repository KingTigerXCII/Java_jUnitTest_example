package starwars.interfaces;

import java.util.HashMap;

import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;

public interface Fight {
	
	void stormAgainstJedi(Stormtrooper[] stormtroopers, Jedi[] jedis);	
	void showFightScore();
	HashMap<String, Integer> getScores();
	
}

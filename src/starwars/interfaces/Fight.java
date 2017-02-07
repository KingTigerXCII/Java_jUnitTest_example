package starwars.interfaces;

import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;

public interface Fight {
	
	void stormAgainstJedi(Stormtrooper[] stormtroopers, Jedi[] jedis);	
	void showFightScore();

}

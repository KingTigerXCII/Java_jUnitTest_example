package starwars.interfaces;

import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;

public interface FightManager {

	void stormAgainstJedi(Stormtrooper[] stormtroopers, Jedi[] jedis);

}

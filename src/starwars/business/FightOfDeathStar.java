package starwars.business;

import starwars.interfaces.FightManager;
import starwars.manager.FightOfDeathStarManager;
import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;

public class FightOfDeathStar {
	
	public void stormAgainstJedi(Stormtrooper[] stormtroopers, Jedi[] jedis) {
		GetManager().stormAgainstJedi(stormtroopers, jedis);
	}
	
	protected FightManager GetManager() {
		return new FightOfDeathStarManager();
	}

}

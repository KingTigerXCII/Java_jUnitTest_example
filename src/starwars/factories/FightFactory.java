package starwars.factories;

import starwars.business.FightOfDeathStar;
import starwars.interfaces.Fight;

public class FightFactory {

	private static Fight fightOfDeathstar = new FightOfDeathStar();
	
	public static Fight Create() {
		return fightOfDeathstar;
	}
	
}

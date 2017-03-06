package starwars.factories;

import starwars.constants.FightType;
import starwars.fights.FightOfDeathStar;
import starwars.interfaces.Fight;

public class FightFactory {

	public static Fight getFight(FightType fightType) {
		
		if (fightType == null) {
			return null;
		}
		
		if (fightType == FightType.Deathstar) {
			return new FightOfDeathStar();
		}
		
		return null;
		
	}
	
}

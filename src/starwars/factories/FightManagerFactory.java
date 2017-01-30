package starwars.factories;

import starwars.interfaces.FightManager;
import starwars.manager.FightOfDeathStarManager;

public class FightManagerFactory {

	private static FightManager fightOfDeathStarMgr = new FightOfDeathStarManager();
	
	public static FightManager Create() {
		return fightOfDeathStarMgr;
	}
	
	public static void SetManagerInstance(FightManager value) {
		fightOfDeathStarMgr = value;
	}
	
}

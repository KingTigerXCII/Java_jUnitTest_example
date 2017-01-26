package starwars.main;

import starwars.business.FightSimulator;
import starwars.constants.JediRank;
import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stormtrooper[] stormtroopers = new Stormtrooper[5];
		Jedi[] jedis = new Jedi[5]; 

		for(int i=0; i < stormtroopers.length; i++) {
			stormtroopers[i] = new Stormtrooper("ST123" + i);			
		}
		
		for(int i=0; i < jedis.length; i++) {
			jedis[i] = new Jedi("Obi Wan" + i, "blue", JediRank.JEDI_MASTER);	
		}
		
		FightSimulator fightSimulator = new FightSimulator();
		fightSimulator.stormAgainstJedi(stormtroopers, jedis);
	}

}

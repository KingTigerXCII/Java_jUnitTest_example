package starwars.test;

import static org.junit.Assert.*;

import org.junit.Test;

import starwars.business.FightOfDeathStar;
import starwars.constants.JediRank;
import starwars.models.characters.Jedi;
import starwars.models.characters.Stormtrooper;

public class FightOfDeathStarTest {

	@Test
	public void StormAgainstJedis_JediWins_IncreaseCountOfJediWins() {
		FightOfDeathStar fightOfDeathStar = new FightOfDeathStar();
		
		Stormtrooper[] stormtroopers = new Stormtrooper[1];
		Jedi[] jedis = new Jedi[5];
		
		for(int i=0; i < stormtroopers.length; i++) {
			stormtroopers[i] = new Stormtrooper("ST123" + i);			
		}
		
		for(int i=0; i < jedis.length; i++) {
			jedis[i] = new Jedi("Obi Wan" + i, "blue", JediRank.JEDI_MASTER);	
		}
		
		fightOfDeathStar.stormAgainstJedi(stormtroopers, jedis);
		assertEquals(fightOfDeathStar.getJediWins(), 1);
	}
	
	@Test
	public void StormAgainstJedis_StormWins_IncreaseCountOfStormWins() {
		FightOfDeathStar fightOfDeathStar = new FightOfDeathStar();
		
		Stormtrooper[] stormtroopers = new Stormtrooper[50];
		Jedi[] jedis = new Jedi[5];
		
		for(int i=0; i < stormtroopers.length; i++) {
			stormtroopers[i] = new Stormtrooper("ST123" + i);			
		}
		
		for(int i=0; i < jedis.length; i++) {
			jedis[i] = new Jedi("Obi Wan" + i, "blue", JediRank.JEDI_MASTER);	
		}
		
		fightOfDeathStar.stormAgainstJedi(stormtroopers, jedis);
		assertEquals(fightOfDeathStar.getStormtrooperWins(), 1);
	}
}

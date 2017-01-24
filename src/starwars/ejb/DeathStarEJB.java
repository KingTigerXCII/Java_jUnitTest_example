package starwars.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import starwars.models.characters.Jedi;
import starwars.models.characters.Sith;
import starwars.models.characters.Stormtrooper;

/**
 * Session Bean implementation class DeathStarEJB
 */
@Stateless
@LocalBean
public class DeathStarEJB {

	private Stormtrooper stormtroopers [];
	private Jedi jedis [];
	private Sith siths [];
	
    /**
     * Default constructor. 
     */
    public DeathStarEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	
    }
    
    public void jediStormtrooperFight() {
    	
    }

}

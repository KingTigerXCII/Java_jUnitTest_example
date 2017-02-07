package starwars.output;

import java.util.HashMap;

public class ConsoleOutput {

	public void showJediWins() {
		System.out.println("----------------------------");
		System.out.println("JEDI 			WINS");
		System.out.println("----------------------------");
	}
	
	public void showStormtrooperWins() {
		System.out.println("----------------------------");
		System.out.println("Stormtroopers 	WINS");
		System.out.println("----------------------------");
	}
	
	public void showFightScore(HashMap<String, Integer> scores) {

		for(HashMap.Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println(entry.getKey() + "-----" + entry.getValue());
			System.out.println("----------------------------");
		}
	}
	
}

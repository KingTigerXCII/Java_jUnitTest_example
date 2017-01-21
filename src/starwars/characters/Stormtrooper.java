package starwars.characters;

public class Stormtrooper {
	String identificationNumber;

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	public void useBlaster() {
		System.out.printf("The Stormtrooper %s use his magic", this.getIdentificationNumber());
	}
	
}

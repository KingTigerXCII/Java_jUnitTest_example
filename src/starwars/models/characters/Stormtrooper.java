package starwars.models.characters;

public class Stormtrooper {

	private String identificationNumber;
	
	public Stormtrooper(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	public void useBlaster() {
		System.out.printf("The Stormtrooper %s use his blaster", this.getIdentificationNumber());
		System.out.println();
	}
	
}

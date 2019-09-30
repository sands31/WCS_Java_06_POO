public class Wilder {


	//Attributs
	private String firstname;
	private boolean aware;

	//Constructeurs
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}

	//Getters
	public String getFirstname() {
		return this.firstname;
	}

	public boolean isAware() {
		return this.aware;
	}

	//Setters
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	//Methode instanciée
	public String whoAmI() {
		if (this.isAware())
			return "Je m'appelle " + this.getFirstname() + " et je suis aware.";
		return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware.";
	}
}
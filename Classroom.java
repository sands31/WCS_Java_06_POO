public class Classroom {


	public static void main(String[] args) {

		Wilder abdel = new Wilder("Abdel", true);
		Wilder adrien = new Wilder("Adrien", true);
		Wilder amani = new Wilder("Amani", true);
		Wilder aymeric = new Wilder("Aymeric", true);
		Wilder clement = new Wilder("Clément", true);
		Wilder jc = new Wilder("Jean-Chirstophe", true);
		Wilder jean = new Wilder("Jean", true);
		Wilder chugaeri = new Wilder("Chugaeri", false);

		System.out.println("Ici, tout le monde est aware, pour preuve :");
		System.out.println(aymeric.whoAmI());
		System.out.println(amani.whoAmI());
		System.out.println(abdel.whoAmI());
		System.out.println(adrien.whoAmI());
		System.out.println(clement.whoAmI());
		System.out.println(jc.whoAmI());
		System.out.println(jean.whoAmI());
		System.out.println("\n" + chugaeri.whoAmI());
	}
}
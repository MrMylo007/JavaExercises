
public class Programm {

	public static void main(String[] args) {
		
		Manager man1 = new Manager("Henrie", "Boss", 1, 40);
		String firstname = man1.getFirstName();
		int nrofEmployees = man1.getNumberOfEmployees();
		System.out.println(firstname);
		System.out.println(nrofEmployees);
		
		Assistant ass1 = new Assistant("Markus", "Assistent", 2, 50);
	}

}

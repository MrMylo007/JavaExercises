
public class Person {

	//Attribute
	private String firstName;
	private String lastName;


	//Getter
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	//Setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	//Konstruktor
	public Person () {
	}

	public Person(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		System.out.println("Konstructor Person ");
	}
	
	
}

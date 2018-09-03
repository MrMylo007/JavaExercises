
public class Manager extends Employee{
	//Attribute
	private int numberOfEmployees;

	//Getter
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	//Setter
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	//Konstructor
	public Manager() {
		
	}
	
	public Manager(String fn, String ln, long id, int noe) {
		super(fn, ln, id);
		this.numberOfEmployees = noe;
		System.out.println("Konstructor Manager");
		
	}
	
	
}

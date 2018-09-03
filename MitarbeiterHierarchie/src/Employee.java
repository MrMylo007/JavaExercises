
public class Employee extends Person{

	//Attribut
	private long employeeID;

	//Getter
	public long getEmployeeId() {
		return employeeID;
	}

	//Setter
	public void setEmployeeId(long employeeId) {
		this.employeeID = employeeId;
	}
	
	//Konstruktor
	public Employee() {
		
	}
	
	public Employee(String fn, String ln, long id) {
		super(fn, ln);
		this.employeeID = id;
		System.out.println("Konstructor Employee ");
	}
	
	
	
	
}

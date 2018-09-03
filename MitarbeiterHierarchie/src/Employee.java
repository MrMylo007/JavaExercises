
public class Employee extends Person{

	//Attribut
	private long employeeId;

	//Getter
	public long getEmployeeId() {
		return employeeId;
	}

	//Setter
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	//Konstruktor
	public Employee() {
		
	}
	
	public Employee(String fn, String ln, long id) {
		super(fn, ln);
		this.employeeId = id;
		System.out.println("Konstructor Employee ");
	}
	
	
	
	
}

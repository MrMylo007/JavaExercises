
public class Assistant extends Employee{
	//Attribute
	private int hoursPerWeek;

	//Getter
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	//Setter
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	//Konstructor
	public Assistant() {
		
	}
	
	public Assistant(String fn, String ln, long id, int hpw) {
		super(fn, ln, id);
		this.hoursPerWeek = hpw;
	}
	
	
}

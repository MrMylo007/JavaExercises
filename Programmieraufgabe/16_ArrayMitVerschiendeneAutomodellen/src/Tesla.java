public class Tesla implements iCar {
	//Attribute
	private String model;
	private int horsePower;
	private int xPosition;
	private int yPosition;
	
	//Konstructor
	public Tesla(String model, int ps, int xPos, int yPos) {
		this.model = model;
		this.horsePower = ps;
		this.xPosition = xPos;
		this.yPosition = yPos;
	}
	
	
	public void drive(int x, int y) {
		this.xPosition += x;
		this.yPosition += y;
		
		System.out.println("Das Auto hat sich erfolgreich bewegt!");
		
	}

	public void printPosition() {
		System.out.println("Aktuelle x-Position:" + this.xPosition);
		System.out.println("Aktuelle y-Position:" + this.yPosition);
		System.out.println();
	}
	
	
	
	

}

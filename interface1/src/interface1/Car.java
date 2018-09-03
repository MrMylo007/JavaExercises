package interface1;

public class Car implements iBuyable{
	//Attribute
	private int xPosition;
	private int yPosition;
	private double price;
	
	//Konstruktor
	public Car(int x, int y) {
		this.xPosition = x;
		this.yPosition = y;
	}

		
	//void
	public void buyProduct() {
		System.out.println("Preis: " + this.price);
		System.out.println("Produkt erfolgreich gekauft ....");
	}
	
	

}

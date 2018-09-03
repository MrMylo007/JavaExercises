package interface1;

public class Fruit extends SupermarketProduct implements iBuyable, Transportable{
	//Attribut
	private double price;
	
	//Konstructor
	
	//Void
	public void buyProduct() {
		System.out.println("Preis: " + this.price);
		System.out.println("Produkt erfolgreich gekauft ....");
	}

}

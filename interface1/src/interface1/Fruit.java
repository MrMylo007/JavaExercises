package interface1;

public class Fruit extends SupermarketProduct implements iBuyable{
	//Attribut
	private double price;
	
	//Konstructor
	
	//Void
	public void buyProduct() {
		System.out.println("Preis: " + this.price);
		System.out.println("Produkt erfolgreich gekauft ....");
	}
	
	//erbt testMethod von Eltern-Klasse
	//überschreiben der methode
	//grün -> overrides interface1.SupermarketProduct.testMethod
	public void testMethod() {
		System.out.println("Das ist die überschriebe methode");
	}

}

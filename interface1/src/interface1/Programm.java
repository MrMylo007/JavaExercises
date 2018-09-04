package interface1;

public class Programm {

	public static void main(String[] args) {
		//Kind-Klasse
		Fruit fruit1 = new Fruit();
		
		//Eltern-Klasse
		SupermarketProduct product1 = new SupermarketProduct();
		
		fruit1.testMethod();
		product1.testMethod();
	}

}

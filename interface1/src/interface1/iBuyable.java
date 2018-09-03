package interface1;

public interface iBuyable {

	//Kann keine Instanz instanziert werden!
	//iBuyable test = new iBuyable();
	//Error Msg -> Cannot instantiate the type iBuyable
	
	//Interface gibt es kein Konstruktor
	//Interfaces cannot have constructors
	
	//Nur Spec keine Bodys in Interface
	//abstract methods do not specify a body
	
	
	public static final int x = 10;
	//static klassenvariable
	//final (Konstanter Wert) -> The blank final field x may not have been initialized
	//The final field iBuyable.x cannot be assigned
	
	//Abstracte Methode
	void buyProduct(); //alle methoden sind public
	
	
}

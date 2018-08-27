package Tutorials.Loop;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kontrollstruktur steuern den Programmablaufplan
		
		// while = solange
		
		/* Allgemeiner Aufbau einer while-Schleife
		 * 
		 * while(Bedigung){
		 * 
		 * 	Anweisungsblock
		 * 
		 * }
		 * 
		 * Merke: Bedigung kann entweder true = wahr
		 *        oder
		 *        false = ncht wahr
		 *        sein
		 */
		
		int count = 1;
//		while(count != 6) { //true
//		System.out.println("Ich bin " + count);
//	    }
		
		while(true) {
			System.out.println("Hi");
			if (count == 3) {  //true
				break;
			}
			count ++; //Zaehler
		}
	}

}

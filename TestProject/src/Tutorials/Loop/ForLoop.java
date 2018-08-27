package Tutorials.Loop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Kontrollstruktur steuern den Programmablaufplan
		
		// for  = sei ...
		
		/* Allgemeiner Aufbau einer For-Schleife
		 * 
		 * for (Anfangswert; Abbruchbeedigungen; Zaehler)]{
		 * 
		 * 
		 * }
		 * 
		 */
		
		for(int i = 0; i <10; i++) {
			System.out.println(i);
		}
		
		for(int j = 0; j <=10; j++) {
			if (j == 5) {
				System.out.println("Hey du hast mich gefunden " + j);
			}
			
		}
		
	}

}

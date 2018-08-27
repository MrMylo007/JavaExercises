package Tutorials.Array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array Deklaration
		// Datatyp[] Name = new Datentyp[Anzahl];
		
		int[] lottoZahlen = new int[6];
		
		for(int i = 0; i < lottoZahlen.length; i++) {
			lottoZahlen[i] = i;
			System.out.println(i);
		}
		
		// Merke: Index - Anzahl der Elemente -1 
		// Index hier ist 0..5
		
		
 	}

}

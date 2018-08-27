package Tutorials.Array;

import java.util.Scanner;

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
		
		System.out.println("Geben Sie 6 Lottozahlen ein:");
		for(int i = 0; i < lottoZahlen.length; i++) {
			Scanner scan = new Scanner(System.in);
			int zahlUser = scan.nextInt();
			lottoZahlen[i] = zahlUser;
		}
		
		//Output des User Inputs:
		for(int i = 0; i < lottoZahlen.length; i++) {
			System.out.println(lottoZahlen[i]);
		}
		
 	}

}

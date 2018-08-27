package Tutorials.Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Variable Dekalartion
		//Datentyp Name = Wert;
		
		int zahl = 50;
		double zahl1 = 34.35;
		
		//Array Deklaration
		//Datatyp[] Name = new Datatp[Anzahl];
		int[] zahlArray = new int [7];
		zahlArray[3] = 50;
		zahlArray[5] = 500;
		zahlArray[0] = 40;
		
		double[] zahlArray1 = new double[7]; //nur das array erstellen
		zahlArray1[1] = 34.35;
		zahlArray1[4] = 50.45;
		
		String[] personA = {"Peter " + " Mueller ", "35"};
		System.out.println("Name:" + personA[0]);
		
		
	}

}

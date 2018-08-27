package Tutorials.Array;

import java.util.Random;

public class ArrayTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Elements as Counters
		// https://youtu.be/pHxtKDENDdE
		
		Random rand = new Random();
		//A new Array called freq, which has 7 Index
		int freq[] = new int[7];
		
		//Roll the Dice 1000 Times
		for(int roll = 1; roll < 1000; roll ++) {
			//Everytime the dice hits a number between 1-6
			//it stores and count the hits.
			++freq[1 + rand.nextInt(6)];
			
		}

		System.out.println("Face\tFrequency");
		
		//Basic Table
		for (int face = 1; face < freq.length; face ++) {
			System.out.println(face + "\t" + freq[face]);
		}
	}

}

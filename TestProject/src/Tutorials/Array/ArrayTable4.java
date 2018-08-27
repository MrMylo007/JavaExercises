package Tutorials.Array;

public class ArrayTable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enhanced for Loop
		// https://youtu.be/w41D0V-BnKQ
		
		int ArrayList[] = {3,4,5,6,7};
		int total = 0;
		
		//Enhanced for Loop.Loop trough the ArrayList
		for (int x: ArrayList) {
			total+=x;
		}
		
		System.out.println(total);
	}

}

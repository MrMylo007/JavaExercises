package Tutorials.Array;

public class ArrayTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Index\tValue");
		
		int arrayName[]= {21,12,18,43, 2,51};
		
		for (int counter = 0; counter < arrayName.length; counter ++) {
			System.out.println(counter + "\t" + arrayName[counter]);
		
		}
	}

}

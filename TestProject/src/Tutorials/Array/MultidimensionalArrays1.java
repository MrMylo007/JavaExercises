package Tutorials.Array;

public class MultidimensionalArrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Multidimensional Arrays
		
		int firstArray[][]= {{8,9,10,11},{12,13,14,15}};
		//firstArray[0][1] = 1;
		
		//call method
		System.out.println("This is the first array");
		display(firstArray);
		
		
		//3 Rows
		int secondArray[][]= {{30,31,32,33}, {43}, {4,5,6}};
		//30, 31, 32,33
		//43 (secondArray[1][0]
		//4 (secondArray[2][0], 5 (secondArray[2][1], 6 (secondArray[2][2]
	
		//call method
		System.out.println("This is the 2nd array");
		display(firstArray);

	}
	
	public static void display(int x[][]) {
		//2 Loops needed
		//1 for the rows
		//1 for the columns
		
		//loop trough the rows
		for(int row = 0; row <x.length; row ++) {
			//loop trough the columns
			for(int column = 0; column < x[row].length; column ++) {
				System.out.print(x[row][column] + "\t");
			}
			
			System.out.println();
			
		}
	}

}

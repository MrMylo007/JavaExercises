package Tutorials.Array;

public class ArrayTable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays in Methods
		// https://youtu.be/rzXoz2KOP7E
		
		int arrayList[] = {3,4,5,6,7};
		System.out.println("Curent ArrayList");
		for(int y:arrayList) {
			System.out.println(y);
		}
		
		//call method
		change(arrayList);
		
		System.out.println("New ArrayList after change");
		for(int y:arrayList) {
			System.out.println(y);
		}
	}

	public static void change (int x[]) {
		for (int counter = 0; counter < x.length; counter ++) {
	
			//Add 5 to current index value
			x[counter] +=5;
		}
			
		
	}
}

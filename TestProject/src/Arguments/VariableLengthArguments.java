package Arguments;

public class VariableLengthArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable Length Arguements
		
		System.out.println(avaerag(43,55,30,156));
		System.out.println(avaerag(43,55,30,156,200,500));
		System.out.println(avaerag(30, 40, 50));
		
		//Call Method
		avaerag2(30, 40, 50);
	}
	
	// ... = dont know how many arguments
	public static int avaerag (int...numbers) {
		int total = 0;
		for (int x:numbers) {
			total+=x;
		}
		
		return total/numbers.length;
	}
	
	// ... = dont know how many arguments
	public static void avaerag2 (int...numbers) {
		int total = 0;
		for (int x:numbers) {
			total+=x;
		}
		int newTotal = total/numbers.length;
		
		System.out.println(newTotal); 
	}

}

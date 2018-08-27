package Tutorials.Array;

public class ArrayTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayList[] = {21,16,86,21,3};
		int sum = 0;
		
		for (int counter = 0; counter < arrayList.length; counter ++) {
			sum+=arrayList[counter];		
		}
		
		System.out.println("The sum of these numers is: " + sum);

	}

}

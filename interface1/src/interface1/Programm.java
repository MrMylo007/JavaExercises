package interface1;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car(10,10);
		Fruit fruit1 = new Fruit();
		
		iBuyable[] testArr = new iBuyable[10];
		testArr[0] = car1;
		testArr[1] = fruit1;
		

		System.out.println(iBuyable.x);
	}

}

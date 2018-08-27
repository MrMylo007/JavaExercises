package Time;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		time TimeObject = new time();
		System.out.println(TimeObject.toMilitary());
		
		TimeObject.setTime(22, 47, 30);
		System.out.println(TimeObject.toMilitary());

	}

}

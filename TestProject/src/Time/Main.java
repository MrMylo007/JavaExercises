package Time;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://youtu.be/E0BTAqIltFc
		
		time TimeObject = new time();
		System.out.println(TimeObject.toMilitary());
		
		TimeObject.setTime(22, 47, 30);
		System.out.println(TimeObject.toMilitary());
		
		TimeObject.setTime(2, 47, 30);
		System.out.println(TimeObject.toString());

	}

}

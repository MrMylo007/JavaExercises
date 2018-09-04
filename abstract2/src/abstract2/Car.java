package abstract2;

public abstract class Car implements iDriveable{
	
	private int horsePower;
	
	public void drive() {
		System.out.println("Das Auto fährt...");
	}
	
	public abstract void openDoor();
	
	

}

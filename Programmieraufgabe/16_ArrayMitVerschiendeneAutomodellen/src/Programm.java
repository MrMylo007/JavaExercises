public class Programm {

	public static void main(String[] args) {
		
		Audi audiA4 = new Audi("AudiA4", 170, 0, 0);
		Audi audiA7 = new Audi("AudiA7", 170, 0, 0);
		
		Tesla model3 = new Tesla ("Model 3", 200, 10, 10);
		Tesla modelS = new Tesla ("Model S", 400, 20, 20);
		Tesla modelX = new Tesla ("Model X", 360, 30, 30);
		
		//Überklasse Array
		//Typ icar.
		//kennt objekte von der Klasse Audi und Tesla!
		
		iCar[] carArr = new iCar[5];
		carArr[0] = audiA4;
		carArr[1] = audiA7;
		carArr[2] = model3;
		carArr[3] = modelS;
		carArr[4] = modelX;
		
		carArr[3].printPosition();
		carArr[3].drive(200, 200);
		carArr[3].printPosition();
	}

}


public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Konto-Eröffnungs-Programm");
		
		//Instanz Banken
		DeutscheBank db = new DeutscheBank(1000);
		Commerzbank cb = new Commerzbank(2000);
		UniCredit uc = new UniCredit(3000);
		KfW kfw = new KfW(4000);
		
		//Instanz Personen
		Person p1 = new Person("Pruin", "Markus", 2344.87);
		Person p2 = new Person("Max", "Müller", 2500);
		Person p3 = new Person("Samira", "Meier", 70);
		
		db.openBankAccount(p1);
		cb.openBankAccount(p2);
		uc.openBankAccount(p3);
		
	}

}

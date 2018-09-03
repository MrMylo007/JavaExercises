
public class Person {
	private String Nachname;
	private String Vorname;
	private double Betrag;
	private Bank myBank;
	
	
	//Getter & Setter
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public double getBetrag() {
		return Betrag;
	}
	public void setBetrag(double betrag) {
		Betrag = betrag;
	}
	public Bank getMyBank() {
		return myBank;
	}
	public void setMyBank(Bank myBank) {
		this.myBank = myBank;
	}
	
	//Konstruktor
	public Person (String pNachmane, String pVorname, double pBetrag) {
		this.Nachname = pNachmane;
		this.Vorname = pVorname;
		this.Betrag = pBetrag;
	}

	
	
}

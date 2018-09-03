public class Bank {

	//Attribut
	private String BankName;
	private double BankKredit;
	
	//Getter
	public double getBankKredit() {
		return BankKredit;
	}
	public String getBankName() {
		return BankName;
	}
	
	//Setter	
	public void setBankKredit(double bankKredit) {
		BankKredit = bankKredit;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	
	//Konstructor
	public Bank(double pBankkredit) {
		this.BankKredit = pBankkredit;
	}
	
	public void openBankAccount(Person p)
	{
		System.out.println("Hallo Herr " + p.getNachname());
		System.out.println("Sie habe Ihr Konto erfolgreich eröffnet:");
		System.out.println();
		System.out.println("Name der Bank: " + getBankName());
		
		p.setMyBank(this);
		
		System.out.println("Ihr Kontostand: " + p.getBetrag());
		System.out.println("Kreditlimit: " + getBankKredit());
		System.out.println("Wir freuen uns auf Ihren nächsten Besuch!");
		System.out.println("****************************************************");
	}
	
}

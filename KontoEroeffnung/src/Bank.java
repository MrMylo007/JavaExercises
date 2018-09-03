
public class Bank {

	//Attribut
	private String BankName;
	private double BankKredit;
	
	//Getter
	public String getBankName() {
		return BankName;
	}
	public double getBankKredit() {
		return BankKredit;
	}
	
	//Setter
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	
	public void setBankKredit(double bankKredit) {
		BankKredit = bankKredit;
	}
	
	//Konstructor
	public void Bank(String pBankname, double pBankkredit) {
		this.BankName = pBankname;
		this.BankKredit = pBankkredit;
	}
	
}

package week3.day1.assignments;

public class Kvb extends Rbi {

	public void loanInterestRate(String personalLoan) {
		System.out.println("Intrest Rate is 8.75%");
	}
	public static void main(String[] args) {
		Kvb k = new Kvb();
		k.loanInterestRate("Personal Loan");
		k.loanInterestRate();	
		k.loanInterestRate("Agri");
	}
}


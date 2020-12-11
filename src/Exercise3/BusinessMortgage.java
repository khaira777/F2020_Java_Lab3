package Exercise3;

public class BusinessMortgage extends Mortgage {

	public BusinessMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
		super(mortgageNumber, customerName, amount, interestRate, term);
		setInterestRate(getInterestRate() + 1);
	}

	@Override
	public String getMortgageInfo() {
		return "\nBusinessMortgage \nMortgage Number=" + getMortgageNumber() + "\nCustomer Name="
				+ getCustomerName() + "\nAmount=" + getAmount() + "\nInterest Rate=" + getInterestRate()
				+ "\nTerm=" + getTerm();
	}

}
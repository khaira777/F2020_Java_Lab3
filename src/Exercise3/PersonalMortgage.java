package Exercise3;

public class PersonalMortgage extends Mortgage {

	public PersonalMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
		super(mortgageNumber, customerName, amount, interestRate, term);
		setInterestRate(getInterestRate() + 2);
	}

	@Override
	public String getMortgageInfo() {
		return "\nPersonalMortgage \nMortgage Number=" + getMortgageNumber() + "\nCustomer Name="
				+ getCustomerName() + "\nAmount=" + getAmount() + "\nInterest Rate=" + getInterestRate()
				+ "\nTerm=" + getTerm();
	}

}

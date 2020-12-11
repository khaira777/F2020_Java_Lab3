package Exercise1;

public class Life extends Insurance {

	@Override
	public void setInsuranceCost() {
		System.out.println("Enter monthly cost:");
		monthlyCost = sc.nextDouble();
	}

	@Override
	public void displayInfo() {
		System.out.println("The monthly life insurance is " + monthlyCost);
	}
}
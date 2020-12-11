package Exercise1;

import java.util.Scanner;

public abstract class Insurance {
	Scanner sc = new Scanner(System.in);

	// instance variables
	String typeOfInsurance;
	double monthlyCost;

	// getters
	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}

	public double getMonthlyCost() {
		return monthlyCost;
	}

	public abstract void setInsuranceCost();

	public abstract void displayInfo();

}

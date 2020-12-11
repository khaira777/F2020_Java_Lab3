package Exercise1;

import java.util.Scanner;

public class InsuranceTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Health Insurance");
		System.out.println("Life Insurance");
		System.out.println("Enter the type of insurance: ");
		
		String typeOfInsurance= s.nextLine();
		
		if(typeOfInsurance.equals("Health Insurance")) {

			Health h1 = new Health();
			Health h2 = new Health();
			Health h3 = new Health();
			
			h1.setInsuranceCost();
			h1.displayInfo();
			System.out.println();
			
			h2.setInsuranceCost();
			h2.displayInfo();
			System.out.println();
			
			h3.setInsuranceCost();
			h3.displayInfo();
			System.out.println();
			
			Health[] h = {h1, h2, h3};
			for (Health health : h) {
				System.out.println("Type of the insurance: " + typeOfInsurance);
				System.out.println("Monthly cost: " + health.getMonthlyCost());
				System.out.println();
			}
		}
		else if (typeOfInsurance.equals("Life Insurance")){
			
			Life l1 = new Life();
			Life l2 = new Life();
			Life l3 = new Life();

			l1.setInsuranceCost();
			l1.displayInfo();
			System.out.println();

			l2.setInsuranceCost();
			l2.displayInfo();
			System.out.println();

			l3.setInsuranceCost();
			l3.displayInfo();
			System.out.println();

			Life[] l = {l1, l2, l3};
			for (Life life : l) {
				System.out.println("Type of the insurance: " + typeOfInsurance);
				System.out.println("Monthly cost: " + life.getMonthlyCost());
				System.out.println();
			}
		}
	}
}

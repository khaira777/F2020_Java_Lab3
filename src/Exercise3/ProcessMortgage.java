package Exercise3;

import java.util.Scanner;

public class ProcessMortgage {
	public static void main(String[] args) {

		Mortgage[] loans = new Mortgage[3];

		int choice;
		int number = 0;
		String name = "";
		double amount = 0.0;
		double rate = 0.0;
		int term;

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println("Choose Mortgage:");
			System.out.println("1.Personal");
			System.out.println("2.Business");
			choice = s.nextInt();

			if (choice == 1) {
				System.out.println("Enter number:");
				number = s.nextInt();
				System.out.println("Enter name:");
				name = s.next();
				System.out.println("Enter amount:");
				amount = s.nextDouble();
				System.out.println("Enter interestRate:");
				rate = s.nextDouble();
				System.out.println("Enter term in years:");
				term = s.nextInt();

				Mortgage m1 = new PersonalMortgage(number, name, amount, rate, term);
				loans[i] = m1;
			}
			if (choice == 2) {

				System.out.println("Enter number:");
				number = s.nextInt();
				System.out.println("Enter name:");
				name = s.next();
				System.out.println("Enter amount:");
				amount = s.nextDouble();
				System.out.println("Enter interestRate:");
				rate = s.nextDouble();
				System.out.println("Enter term in years:");
				term = s.nextInt();

				Mortgage m2 = new BusinessMortgage(number, name, amount, rate, term);

				loans[i] = m2;

			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(loans[i].getMortgageInfo());
		}
	}
}

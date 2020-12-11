package Exercise2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Game tester to create: ");
			System.out.println("P for parttime");
			System.out.println("F for fulltime");

			String option = scan.nextLine();

			if (option.equalsIgnoreCase("P")) {

				PartTimeGameTester pt = new PartTimeGameTester();

				System.out.println("Enter total hours of the parttime tester:");

				pt.isFullTime = false;
				pt.setTotalHours(Double.parseDouble(scan.nextLine()));

				System.out.println("Part-time salary: " + pt.calculateSalary());

			} else if (option.equalsIgnoreCase("F")) {

				FullTimeGameTester ft = new FullTimeGameTester();

				ft.isFullTime = true;

				System.out.println("Full time tester salary : " + ft.calculateSalary());

			} else {

				System.out.println("Invalid choice, try again");
				continue;
			}
			System.out.println("Do you want to continue (y/n)");
			String next = scan.nextLine();
			if (next.equalsIgnoreCase("y")) {
				continue;
			} else {
				return;
			}
		}

	}

}

package Exercise2;

public class PartTimeGameTester extends GameTester {
	private double perHour = 20;
	private double totalHours;

	@Override
	public double calculateSalary() {
		double partTimesalary = perHour * totalHours;
		return partTimesalary;
	}

	public double getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}

}

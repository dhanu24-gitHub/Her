package for2;

public class RetirementAgeInArray {
	public static void main(String[] args) {
		int[] ages = { 35, 56, 68, 99, 27, 93 };
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] > 60) {
				System.out.println(ages[i] + " " + "is a Retirement age");
			}
		}
	}
}

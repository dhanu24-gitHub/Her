package for2;

public class FindingOddEvenInArray {
	public static void main(String[]args) {
		int[] nums = {23,45,86,37,69,37,69,44,78};
		for (int i = 0; i<nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]+" "+"Is Even Number");
			}
			else {
				System.out.println(nums[i]+" "+"Is Odd Number");
			}
		}
	}

}

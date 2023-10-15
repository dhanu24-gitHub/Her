package for2;

public class FindMaxFactorial {
	public static void main(String[]args) {
		int[] nums = {7,4,9,2,8,5};
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println(max);
		
		int fact = 1;
		for(int i = 1; i <= max; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}

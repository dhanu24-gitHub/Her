 package for2;

public class FindMaximum {
	public static void main(String[] args) {
		int[] nums = {7,9,5,4,3};
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max ) {
				max = nums[i];
			}
		}
		System.out.println(max);
	}

}

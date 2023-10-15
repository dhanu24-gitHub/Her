 package for2;

public class FindMinimum {
	public static void main(String[] args) {
		int[] nums = {7,3,9,5,4};
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println(min);
	}

}

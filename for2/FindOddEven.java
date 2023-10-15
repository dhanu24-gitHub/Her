package for2;

public class FindOddEven {
	public static void main(String[] args) {
		int[] nums = {7,3,9,5,4};
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}
	}

}

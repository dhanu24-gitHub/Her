package for2;

public class FindTotal {
	public static void main(String[]args) {
		int[] nums = {7,3,9,5,4};
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		System.out.println(total);
	}

}

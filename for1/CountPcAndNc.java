package for1;

public class CountPcAndNc {
	public static void main(String[]args) {
		int pc = 0;
		int nc = 0;
		int[] nums = {4,-3,6,-6,2,64,-90};
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] >= 0) {
				pc = pc + 1;
			}
			else {
				nc = nc+1;
			}
		}
		System.out.println("positive count is " + pc);
		System.out.println("negative count is " + nc);
	}

}
 
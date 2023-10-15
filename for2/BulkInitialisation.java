package for2;

public class BulkInitialisation {
	public static void main(String[] args) {
		int[] nums = {7,3,9,5,4};
//		for(int i = 0; i < nums.length; i++) {
//			//System.out.println(i);
//			System.out.println(nums[i]);                          //calling each index value lies inside the array
//			System.out.println(nums[i] * nums[i]);                //square of the output
//			System.out.println(nums[i] * nums[i] * nums[i]);      //cube of the output
//		}
		
		for(int i = nums.length-1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

}

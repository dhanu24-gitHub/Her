package logicFor;

public class SumOf7 {
	public static void main(String[] args) {
		int[] nums = {2,3,4,1,5,6,7};

		int targetSum = 7;
		
		System.out.println("Pairs that sum to 7:");
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == targetSum) {
					System.out.println("(" + nums[i] + ", " + nums[j] + ")");
		        }
		    }
		}
	}

}

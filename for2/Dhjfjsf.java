package for2;

public class Dhjfjsf {
	public static void main(String[] args) {
		String a = args[0] ;
		String[] b = a.split(",");
		int c = Integer.parseInt(b[0]);
		int d = Integer.parseInt(b[1]);
		int e = Integer.parseInt(b[2]);
		int f = Integer.parseInt(b[3]);
		int g = Integer.parseInt(b[4]);

		int[] nums = {c,d,e,f,g};
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i]+" is Even Number");
			}
			else {
				System.out.println(nums[i]+" is Odd Number");
			}
		}
		
	}
	 
}

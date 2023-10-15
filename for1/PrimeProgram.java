package for1;

public class PrimeProgram {
	public static void main(String[] args) {
//		int num = 7;
//		 boolean b = true;
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				 b =false;
//			}
//		}
//		if (b == false) {
//			System.out.println(num + " not Prime");
//		}
//		else {
//			System.out.println(num + " Prime");
//		}
		
//Prime program: Another method:
		int num1 = 8; 
		int temp = 0;
		for(int i = 2; i < num1; i++) {
			temp = temp + 1;
		}
		if (temp > 0) {
			System.out.println(num1 + " is not prime");
		} else {
			System.out.println(num1 + " is prime");
		}
		
	}
}

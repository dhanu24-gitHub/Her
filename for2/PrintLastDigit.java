package for2;

public class PrintLastDigit {
	public static void main(String[]args) {
		int num = 10125;
		for (; ;) {
			int temp = num % 10;
			System.out.println(temp);
			break;
		}
	}
} 

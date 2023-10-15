package for1;

public class Palindrome1 {
	public static void main(String[]args) {
		String a = "Dhanalakshmi";
		String b = "";
		for(int i = a.length()-1; i >= 0; i--) {
			if (a.charAt(i)=='a'){
			b = b+(a.charAt(i));
		}
		}
		System.out.println(b);
	}
	
}
 
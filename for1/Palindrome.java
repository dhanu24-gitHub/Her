package for1;

public class Palindrome {
	public static void main(String[] args) {
		String a = "DAD";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b+(a.charAt(i));
		}
			if (b .equals(a) ) {
				System.out.println(b+" Palindrome");
			} else {
				System.out.println(b+" Non Palindrome");
			
		}
	}

}
 
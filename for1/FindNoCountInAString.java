package for1;

public class FindNoCountInAString {
	public static void main(String[] args) {
//		String a = "TN07Y23";
//		int count = 0;
//		int count1 = 0;
//		for(int i = 0; i < a.length(); i++) {
//			if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
//				count = count + 1;
//			}
//			else {
//				count1 = count1 + 1;
//			}
//		}
//		System.out.println(count1);
		
		String a = "earth";
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i'|| a.charAt(i) == 'o' || a.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
 
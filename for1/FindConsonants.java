package for1;

public class FindConsonants {
	public static void main(String[] args) {
		String a = "EARTH";
//		int count = 0;
//		for (int i = 0; i < a.length(); i++) {
//			if (a.charAt(i) != 'A' && a.charAt(i) != 'E' && a.charAt(i) != 'I' && a.charAt(i) != 'O'
//					&& a.charAt(i) != 'U') {
//				count = count + 1;
//				System.out.println(a.charAt(i));
//			}
//		} 
//		System.out.println(count);
		
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
				System.out.println(a.charAt(i));
			}
		}
	}

}

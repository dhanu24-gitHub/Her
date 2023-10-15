package for1;

public class PrintUcInString {
	public static void main(String[] args) {
		String a = "LapTOp";
		//int count = 0;
//		for (int i = 0; i < a.length(); i++) {
//			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				//count++;
//				System.out.println(a.charAt(i));
//			}
//		}
		//System.out.println(count);
		
		char[] c = a.toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] >= 'A' && c[i] <= 'Z') {
				System.out.println(c[i]);
			}
		}
	}

}

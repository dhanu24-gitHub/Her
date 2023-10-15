package for2;

public class Shgejld {
	public static void main(String[] args) {
//		int[] a = {24,57,37,79};
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] < 50) {
//				System.out.println(a[i]*a[i]);
//			}
//			else {
//				System.out.println(a[i]);
//			}
//		}
		
		String[] a = {"jndskjd","sjdsj","dsdkj","ajdh"};
		int count = 0;
		int count1 = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i].length() % 2 == 0) {
				count = count + 1;
			}
			else {
				count1 = count1 + 1;
			}
		}
		System.out.println(count);
		System.out.println(count1);
		
		
		String z = "Computer";
		String y = z.substring(0);
		System.out.println(y);
	}

}

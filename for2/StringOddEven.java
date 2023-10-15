package for2;

public class StringOddEven {
	public static void main(String[] args) {
		String[] a = {"Dhanalakshmi","Prakash","Nishanthi","Manimaran","Mohana"};
//		for (int i = 0; i < a.length; i++) {
//			if (a[i].length() % 2 != 0) {
//				System.out.println(a[i].charAt(a[i].length() / 2));
//			}
//			else {
//				System.out.println(a[i].charAt(a[i].length()/2-1) +""+ a[i].charAt(a[i].length()/2));
//			}
//		}
		String max = a[0];
//		for(int i = 0; i < a.length; i++) {
//			if(a[i].length() < max.length()) {
//				max = a[i];
//			}
//		}
//		System.out.println(max);
		
		for(String i : a) {
			System.out.println(i);
		}
	}

}

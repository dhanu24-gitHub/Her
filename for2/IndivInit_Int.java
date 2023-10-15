package for2;

public class IndivInit_Int {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 5;
		a[1] = 2;
		a[2] = 15;
//		int max = a[0];                                                          //finding max
//		for (int i = 0; i < a.length; i++) {                                     //
//			if(a[i] > max) {                                                     //
//				max = a[i];                                                      //
//			}                                                                    //
//		}                                                                        //
//		System.out.println(max);                                                 //
		
//		int min = a[0];
//		for (int i = 0; i < a.length; i++) {
//			if(a[i] < min) {
//				min = a[i];
//			}
//		}
//		System.out.println(min); 
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
//		System.out.println(a[0]+a[1]+a[2]);
	}

}

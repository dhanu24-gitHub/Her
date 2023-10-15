package logicFor;

public class AscendingDecending {
	public static void main(String[] args) {
		int[] sk = { 2, 5, 6, 1, 9, 3 };
		int temp = 0;
	for (int i = 0; i < sk.length; i++) {
	    for (int j = i + 1; j < sk.length; j++) {
		if (sk[i] > sk[j]) {  
//			----> greater than symbol -- ascending order
//                                      ---->less than symbol --- descending order
					temp = sk[i];
					sk[i] = sk[j];
					sk[j] = temp;

 

				}
			}
			System.out.println(sk[i]);
		}
	}

}

package logicFor;

public class FindDuplicatesWithCount {
	public static void main(String[] args) {
		
//Finding Duplicates with count:
//		String a = "Banana";
//		char[] b = a.toCharArray();
//		for(int i = 0; i < b.length; i++) {
//			int count = 0;
//			for(int j = i+1; j < b.length; j++) {
//				if(b[i] == b[j]) {
//					b[j] = '$';
//					count++;
//				}
//			}
//			if(count > 0 && b[i] != '$') {
//				System.out.println(b[i] + " " + count);
//			}
//		}
		
//Finding Duplicates And Non Duplicates With Count:
		String a = "Banana";
		char[] b = a.toCharArray();
		for(int i = 0; i < b.length; i++) {
			int count = 1;
			for(int j = i+1; j < b.length; j++) {
				if(b[i] == b[j]) {
					b[j] = '$';
					count++;
				}
			}
			if(count >= 0 && b[i] != '$') {
				System.out.println(b[i] + " " + count);
			}
		}
	}

}

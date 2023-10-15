package for2;

public class IndivInit_String {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Malini";
		names[1] = "Pragathi";
		names[2] = "Nisha";
		names[3] = "Dhanalakshmi";
		names[4] = "Subramani";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			if(names[i].length() % 2 == 0) {
				System.out.println(names[i] + " is Even");
			}
			else {
				System.out.println(names[i] + " is Odd");
			}
		}
		
//		String max = names[0];
//		for(int i = 0; i < names.length; i++) {
//			if(names[i].length() > max.length()) {
//				max = names[i];
//			}
//		}
//		System.out.println(max);
	}
}

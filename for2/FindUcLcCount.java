package for2;

public class FindUcLcCount {
	public static void main(String[] args) {
		String value = args[0];
		int count = 0;
		int count1 = 0;
		for(int i = 0; i < value.length(); i++) {
			if(value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				count = count + 1;
			}
			else {
				count1 = count1 + 1;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}

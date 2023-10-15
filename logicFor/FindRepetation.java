package logicFor;

public class FindRepetation {
	public static void main(String[] args) {
		String a = "Banana";
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

}

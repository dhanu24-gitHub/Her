package logicFor;

public class PrintNos {
	public static void main(String[] args) {
		String a = "a1b2c3";
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) > '0' && a.charAt(i) < '9') {
				System.out.println(a.charAt(i));
			}
		}
	}

}

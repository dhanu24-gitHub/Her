package for1;

public class PrintStringLineByLine {
	public static void main(String[]args) {
		String name = "Raja";
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		
		System.out.println();
		
		for (int i = 0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}		
}

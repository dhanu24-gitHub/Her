package for1;

public class StringReverseTask {
	public static void main(String[]args) {
		String name = "RAJA";

		for (int i = name.length()-1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}
}

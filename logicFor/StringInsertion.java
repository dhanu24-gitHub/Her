package logicFor;

public class StringInsertion {
	public static void main(String[] args) {
		String a = "Java";
		String b = "Language";
		String c = a.substring(0,a.length()/2);
		String d = a.substring(a.length()/2);
		System.out.println(c);
		System.out.println(d);
		System.out.println(c+b+d);
	}

}

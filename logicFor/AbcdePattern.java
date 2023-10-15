package logicFor;

public class AbcdePattern {
	public static void main(String[] args) {
		String hi = "abcde";

        for(int i =0;i<hi.length();i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(hi.charAt(i));
        	}
        	System.out.println(" ");
        }

	
	String a = "a1b2c3";
	for(int i =0;i<a.length();i++) {
		if(a.charAt(i)>='0'&&a.charAt(i)<='9') {
			System.out.println(a.charAt(i));
		}
	}
	}
	

}

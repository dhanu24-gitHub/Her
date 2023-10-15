package logicFor;

public class Question1 {
	public static void main(String[] args) {
		String s = args[0];
		String[] a = s.split(",");
		//int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i].contains(a[i].toLowerCase())) {
				System.out.println("yes");
			   // count = count + 1;
			}
			else {
				System.out.println("no");
			}
		}
		//System.out.println(count);
	}

}

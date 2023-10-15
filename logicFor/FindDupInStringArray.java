package logicFor;

import java.util.Arrays;

public class FindDupInStringArray {
	public static void main(String[] args) {
		String a = "this is david and this is my house";
		String[] b = a.split(" ");
		//System.out.println(Arrays.toString(b));
		
		for(int i = 0; i < b.length; i++) {
			int count = 0;
			for(int j = i + 1; j < b.length; j++) {
				if(b[i].equals(b[j])) {
					b[j] = "$";
					count++;
				}
			}
			if(count == 0 && b[i] != "$") {
				System.out.println(b[i]);
			}
		}
	}

}
 
package for2;

public class FindUcInAnarray {
	public static void main(String[] args) {
		String a = args[0];
		String[] concepts = a.split(",");
		int count = 0;
		for(int i = 0; i < concepts.length; i++) {
			if(concepts[i].charAt(i) >= 'A' && concepts[i].charAt(i) <= 'Z') {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}


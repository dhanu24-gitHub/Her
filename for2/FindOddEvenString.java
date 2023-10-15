package for2;

public class FindOddEvenString {
	public static void main(String[] args) {
		String[] names = {"Dhanalakshmi","Prakash","Deekshi","David","Raghul"};
		for(int i = 0; i < names.length; i++) {
			if(names[i].length() % 2 != 0) {
				System.out.println(names[i]);
			}
			else {
				System.out.println(names[i].toUpperCase());
			}
		}
	}

}

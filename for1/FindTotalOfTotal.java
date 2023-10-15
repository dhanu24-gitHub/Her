package for1;

public class FindTotalOfTotal {
	public static void main(String[] args) {
		int a = 8;
		int total = 0;
		int tot = 0;
		for (int i = 0; i <= a; i++) {
			total = total + i;
			tot = total + tot;
		}
		System.out.println(tot);
	}

}

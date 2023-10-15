package for1;

public class Fibonocci {
	public static void main(String[]args) {
		int a = 0;
		int b = 1; 
		int c;
		//int total =1;
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i <=5; i++) {
			c = a + b;   
			//total = total+c;
		System.out.println(c);
			a = b;                     //a=0; b=1; c=1; a=1; b=1; c=2; a =1; b=2; c =3; a=2; b=3; c=5;  
			b = c;
		}
		System.out.println();
		//System.out.println(total);
	}

}

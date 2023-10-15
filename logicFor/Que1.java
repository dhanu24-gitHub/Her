package logicFor;

public class Que1 {
	//Swapping two numbers without using temporary variable
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		System.out.println("Before swapping : a = "+a+"; b = "+b);
		
		a = a + b;   //20 + 10 = 30
		b = a - b;   //20 - 10 = 10
		a = a - b;   //30 - 10 = 20
		
		System.out.println("After Swapping : a = "+a+"; b = "+b);
	}

}
                                        
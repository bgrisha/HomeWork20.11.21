package ecomHomeWork201121;

//4.	Write a Java method to find the smallest number among three numbers
public class Main4 {

	public static void main(String[] args) {
	smallestNumber(10, 20, 30);
	small(9, 6, 7);

	}

	private static void smallestNumber(int a,int b,int c) {
		System.out.println(Math.min(Math.min(a, b), c));
	}
	private static void small(int a,int c,int b) {
		if(a<=b && a<=c) {
			System.out.println("a-smallest "+a);
		}else if(b<=a && b<=c) {
			System.out.println("b-smallest "+b);
		}else {
			System.out.println("c-smallest "+c);
		}
	}
}

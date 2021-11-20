package ecomHomeWork201121;

//5.	Write a Java method to compute the average of three numbers.
public class Main5 {

	public static void main(String[] args) {
		int a = 20;
        int b = 30;
        int c=5;
        System.out.println(getAverage(a, b,c));

	}
	public static double getAverage (int num1, int num2, int num3) 
    { 
     return (num1 + num2 + num3) / 3.0; 
    } 
}

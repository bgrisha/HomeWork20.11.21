package ecomHomeWork201121;

public class Main3 {

	public static void main(String[] args) {
		System.out.println(isPrime(17));
	firstHundredPrimeNumbers(101);

	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n > 1) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void firstHundredPrimeNumbers(int n) {
		for (int i = 1; i <=100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" , ");
			}
		}
	}

}

public class Problem7 {

	public static void main(String[] args) {
		int primeCounter = 0;
		int counter = 0;
		int primeNumber = 0;
		for (int i = 2; i <= 130000; i++) {
			if (isPrime(i)) {
				primeCounter++;
				counter++;
				primeNumber = i;
			}
			else {
				counter++;
			}
			if (primeCounter==10002) {
				break;
			}
			System.out.println("prime number: " + primeNumber + " " + primeCounter + "," + counter);
		}
	}
	
	public static boolean isPrime (int primeNumberCandidate) {
		for (int i = 2; i < primeNumberCandidate; i++) {
			if (primeNumberCandidate%i==0) {
				return false;
			}
		}
		return true;
	}

}

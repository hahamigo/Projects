
public class Problem10 {

	public static void main(String[] args) {
		long primeSum = 0L;
		for (long i = 2L; i <= 2000000L; i++) {
			if (isPrime(i)) {
				primeSum+=i;
			}
		}
		System.out.println(primeSum);
	}
	
	public static boolean isPrime (long primeNumberCandidate) {
		for (int i = 2; i < primeNumberCandidate; i++) {
			if (primeNumberCandidate%i==0) {
				return false;
			}
		}
		return true;
	}

}

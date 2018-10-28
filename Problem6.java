
public class Problem6 {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			sumOfSquares = sumOfSquares + (i*i);
			sum = sum + i;
		}
		squareOfSum = sum * sum;
		int difference = squareOfSum - sumOfSquares;
		System.out.println(difference);
	}

}

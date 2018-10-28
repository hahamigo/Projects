import java.util.ArrayList;

public class Problem3 {
	public static void main(String[] args) {
		for (long i = 3L; i <= 600851475143L ; i++) {
			boolean is_prime = true;
			for (long j = 2L; j < i; j++) {		
				if (i % j == 0) {
					is_prime = false;
					break;
				}
			}
			if (is_prime && 600851475143L % i == 0 ) {
				System.out.println(i + " is a factor of 600851475143");
			}
		}
	}

}

//Find Padromeline number
import java.util.Scanner;
public class Problem4 {
//998001 is the largest product of two 3 digits numbers (999*999)
	public static void main(String[] args) {
		int firstNum;
		int secondNum;
		int product;
		int largest = 0;
		boolean check;
		for (firstNum = 100; firstNum <= 999; firstNum++) {
			for (secondNum = 100; secondNum <= 999; secondNum++) {
				product = firstNum * secondNum;
				check = isPalindromic(product);
				if (check == true) {
					largest = product;
					System.out.println("largest palindromic: " + largest + ", firstNum: " + firstNum + ", secondNum: " + secondNum);
				}
			}
		}
	}
	public static boolean isPalindromic (int product) {
		int reverse = 0;
		int lastDigit = 0;
		int temp = product;
		while (temp>0) {
			lastDigit = temp%10;
			reverse = reverse*10+lastDigit;
			temp = temp/10;
		}
		if (product == reverse) {
			return true;
		}
		else {
			return false;
		}
	}
}

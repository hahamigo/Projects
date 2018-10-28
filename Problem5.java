
public class Problem5 {

	public static void main(String[] args) {
		int returnValue = 1;
		int smallest_number_without_remainder = 0;
		boolean flag = true;
		do {
			if (returnValue%1==0
			  &&returnValue%2==0
			  &&returnValue%3==0
			  &&returnValue%4==0
			  &&returnValue%5==0
			  &&returnValue%6==0
			  &&returnValue%7==0
			  &&returnValue%8==0
			  &&returnValue%9==0
			  &&returnValue%10==0
			  &&returnValue%11==0
			  &&returnValue%12==0
			  &&returnValue%13==0
			  &&returnValue%14==0
			  &&returnValue%15==0
			  &&returnValue%16==0
			  &&returnValue%17==0
			  &&returnValue%18==0
			  &&returnValue%19==0
			  &&returnValue%20==0
				) {
				smallest_number_without_remainder = returnValue;
				
				flag = false;
				
			}
			returnValue++;
		}while(flag);
		System.out.println(returnValue);
	}

}

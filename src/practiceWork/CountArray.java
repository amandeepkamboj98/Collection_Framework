package practiceWork;

public class CountArray {

	public static void main(String[] args) {

		int num = 31,temp =0;
		for(int i = 2; i < num; i++ ) {
			if(num % i == 0 )
			{
				temp = temp +1;
			}
		}
		if(temp == 0) {
			System.out.println("number is prime :"+num);
		}
		else {
			System.out.println("number is not prime :"+num);
		}

	}
}

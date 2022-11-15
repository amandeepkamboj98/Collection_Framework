package practiceWork;

public class Plaindrome {
	
	public static void main(String[] args) {
		int n = 545, rem = 0, res =0;
	    int  temp = n;
		while(temp != 0) {
			rem = temp % 10;
			res = res * 10 + rem;
			temp = temp / 10;
		}
		if(n == res) {
			System.out.println("number is plaindrome :"+ n);
		}
		else {
			System.out.println("number is not plaindrome :"+ n);
		}
	}

}

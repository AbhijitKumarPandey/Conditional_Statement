import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = sc.nextInt();
		int temp =0;
		for(int i=2; i<=number; i++) {
			if(number%i==0) {
				temp = temp+1;
			}
		}
		if(temp==0) {
			System.out.println(number + " is prime !");
		}else {
			System.out.println(number + "is not prime");
		}
		
	}

}

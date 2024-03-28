import java.util.Scanner;

public class Elegible_To_Vote {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 for(int i=0; i<n; i++) {
			 if(n>18) {
			System.out.println("You are Adult");
		}else {
			System.out.println("You are Child ");
		}
	}

}
}



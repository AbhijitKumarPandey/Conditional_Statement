
public class All_Prime_Number_1_to_100 {
	public static void main(String[] args) {
		for(int num =1; num<=100; num++) {
			int temp = 100;
			for(int i=2; i<=num-1; num++) {
				if(num%i==0) {
					temp = temp+1;
					
				}
			}
			if(temp==0) {
				System.out.println(num);
			}
		}
	}

}

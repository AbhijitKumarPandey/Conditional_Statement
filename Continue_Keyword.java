
public class Continue_Keyword {
	public static void main(String[] args) {
		for(int num =1; num<=50; num++) {
//			if(num%3==0) {
//				continue;
//			}
//			System.out.println(num);
//		
//	}
//
//}
//}

		
		// While Loop
		
		int num1 =1;
		while(num1<=50) {
			if(num1%3==0) {
				num1++;
				continue;
			}
			System.out.println(num1);
			num1++;
		}
	}
}
}




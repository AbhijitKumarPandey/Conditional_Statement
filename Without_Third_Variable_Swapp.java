
public class Without_Third_Variable_Swapp {
	public static void main(String[] args) {
		int a = 78;
		int b = 56;
		
		System.out.println("Before Swapping");
		System.out.println(a + " " + b );
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping");
		System.out.println(a + " " + b);
		
	}

}

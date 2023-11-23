import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		
		double VAT_RATE = 0.1;
		double VAT = B/1.1 * VAT_RATE;
		int A = (int)(B - VAT);
		
		System.out.println(A);
	}
}

import java.io.IOException;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws NumberFormatException, IOException { 

		Scanner sc = new Scanner(System.in);
		
		int U1 = sc.nextInt();
		int T1 = sc.nextInt();
		int U2 = sc.nextInt();
		int T2 = sc.nextInt();
		
		System.out.println(56*U1 + 24*T1 + 14*U2 + 6*T2); 
	}
}
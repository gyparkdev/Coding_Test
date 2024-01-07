import java.io.IOException;
import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) throws IOException{ 
		
		Scanner sc = new Scanner(System.in);
		
		int a = 100 - sc.nextInt();
		int b = 100 - sc.nextInt();
		
		int c = 100 - (a + b);
		int d = a * b;
		int q = d / 100;
		int r = d % 100;
		
		System.out.printf("%d %d %d %d %d %d%n", a, b, c, d, q, r);
        System.out.printf("%d %d%n", c + q, r);
	} 
}
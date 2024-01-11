import java.io.IOException;
import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) throws IOException{ 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.println(str.substring(n - 5, n));
	} 
}
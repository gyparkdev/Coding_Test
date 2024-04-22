import java.io.IOException;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws NumberFormatException, IOException { 

		Scanner sc = new Scanner(System.in);
		
		int bottle1 = sc.nextInt();
		int bottle2 = sc.nextInt();
		int bottle3 = sc.nextInt();
		int bottle4 = sc.nextInt();
		int bottle5 = sc.nextInt();
		int bottle6 = sc.nextInt();
		
		System.out.println((bottle1*5)+(bottle2*5)+(bottle3*5)+(bottle4*5)+(bottle5*5)+(bottle6*5)); 
	}
}
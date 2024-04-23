import java.io.IOException;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws NumberFormatException, IOException { 

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(input*input*input); 
	}
}
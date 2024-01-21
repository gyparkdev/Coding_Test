import java.io.IOException;
import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) throws IOException{ 
		 
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();	//S 블럭 갯수
		long M = sc.nextInt();	//A 블럭 갯수
		
		System.out.println(Math.min(N/2, M/2));
	} 
}
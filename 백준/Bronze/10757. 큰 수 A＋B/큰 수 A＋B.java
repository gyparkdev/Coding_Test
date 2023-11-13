import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class Main { 
	
	public static void main(String[] args) throws IOException { 
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		System.out.println(A.add(B));
	} 
}
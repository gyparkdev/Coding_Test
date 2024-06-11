import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int Y = sc.nextInt();
		int M = sc.nextInt();
		int result = M-Y;
		
		System.out.println(M + result);
	}
}
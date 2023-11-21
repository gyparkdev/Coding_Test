import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char result = findChar(N);
		
		System.out.println(result);
	}
	
	private static char findChar(int N) {
		String str = "WelcomeToSMUPC";
		int index = (N - 1) % str.length();
		return str.charAt(index);
	}
}

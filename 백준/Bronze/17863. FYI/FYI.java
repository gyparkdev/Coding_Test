import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String result = input.substring(0, 3);
		
		if(result.equals("555")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}

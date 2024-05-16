import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		String A = N.substring(0, 1);
		String B = N.substring(1, 2);
		
		if(A.equals(B)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}

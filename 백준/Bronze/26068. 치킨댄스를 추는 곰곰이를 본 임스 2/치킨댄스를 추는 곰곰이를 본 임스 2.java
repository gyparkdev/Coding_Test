import java.io.IOException;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws NumberFormatException, IOException { 

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			String xi = sc.next();
			String str = xi.replaceAll("D-", "");
			
			if(Integer.parseInt(str) <= 90) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
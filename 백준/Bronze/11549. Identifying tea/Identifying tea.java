import java.io.IOException;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) throws NumberFormatException, IOException { 

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<5; i++) {
			int answer = sc.nextInt();
			if(T == answer) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
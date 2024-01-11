import java.io.IOException;
import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) throws IOException{ 
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			String name = sc.next();
			if(name.contains("S")) {
				System.out.println(name);
			}
		}
	} 
}
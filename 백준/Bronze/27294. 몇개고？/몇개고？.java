import java.io.IOException;
import java.util.Scanner;


public class Main { 
	
	public static void main(String[] args) throws IOException { 
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int S = sc.nextInt();
		
		if(T <= 11) {		//아침
			System.out.println(280);
		}else if(T <= 16) {	//점심
			if(S == 1) {	//술
				System.out.println(280);
			}else {
				System.out.println(320);
			}
		}else {				//저녁
			System.out.println(280);
		}
	} 
}
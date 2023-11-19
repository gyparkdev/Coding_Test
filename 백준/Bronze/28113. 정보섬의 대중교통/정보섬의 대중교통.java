import java.io.IOException;
import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args) throws IOException { 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//지하철 도보시간
		int A = sc.nextInt();	//마지막 버스
		int B = sc.nextInt();	//마지막 열차
		
		if(B > A) {
			System.out.println("Bus");
		}else if(B < A) {
			System.out.println("Subway");
		}else {
			System.out.println("Anything");
		}
	} 
}
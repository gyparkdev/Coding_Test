import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() * 100;
		int M = sc.nextInt();
		
		if(N >= M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

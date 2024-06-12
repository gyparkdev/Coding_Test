import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t1 = sc.nextInt();
		int e1 = sc.nextInt();
		int f1 = sc.nextInt();
		
		int t2 = sc.nextInt();
		int e2 = sc.nextInt();
		int f2 = sc.nextInt();
		
		int Max = t1*60*3 + e1*60*20 + f1*60*120;
		int Mel = t2*60*3 + e2*60*20 + f2*60*120;
		
		if(Max > Mel) {
			System.out.println("Max");
		}else if(Max < Mel) {
			System.out.println("Mel");
		}else {
			System.out.println("Draw");
		}
	}
}
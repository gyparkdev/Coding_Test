import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();

		// (1등 + 4등) - (2등 +3등)
		// 최소와 최소 중 큰수와 최대와 최대 중 큰 수 는 2,3등임
		int Ateam = Math.max(Math.max(A, B), Math.max(C, D)) + Math.min(Math.min(A, B), Math.min(C, D));
		int Bteam = Math.max(Math.min(A, B), Math.min(C, D)) + Math.min(Math.max(A, B), Math.max(C, D));

		System.out.println(Math.abs(Ateam - Bteam));
	}
}
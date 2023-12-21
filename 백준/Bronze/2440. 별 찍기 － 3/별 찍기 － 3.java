import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) { // 행의 갯수. N이 5이면 5줄 출력
			for (int j = 0; j < N - i; j++) {
				// i가 0일때 j는 *을 5개 출력
				// i가 1일때 j는 *을 4개 출력
				// i가 2일때 j는 *을 3개 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
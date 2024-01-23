import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] <= B[i]) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
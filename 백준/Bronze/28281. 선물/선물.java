import java.util.Scanner;

public class Main {
    static int N, X;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        X = sc.nextInt();

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0] + arr[1];
        for (int i = 1; i < N - 1; i++) {
            min = Math.min(min, arr[i] + arr[i + 1]);
        }

        min *= X;

        System.out.println(min);
    }
}
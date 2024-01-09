import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long res = 1;

        // 계산 및 출력
        for (int i = 11; i <= N; i++) {
            res *= i;
        }
        System.out.println(6 * res);
    }
}
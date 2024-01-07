import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        double R = scanner.nextDouble();
        double C = scanner.nextDouble();
        double N = scanner.nextDouble();

        // 가로와 세로 값을 구해서 반올림
        long RCCTV = (long) Math.ceil(R / N);
        long CCCTV = (long) Math.ceil(C / N);

        // 넓이
        long CCTV = RCCTV * CCCTV;

        System.out.println(CCTV);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int cnt = 3;
        
        A -= 2;
        B -= 1;
        
        int C = Math.min(A, B);
        
        cnt += 2 * C;
        
        System.out.println(cnt);
    }
}
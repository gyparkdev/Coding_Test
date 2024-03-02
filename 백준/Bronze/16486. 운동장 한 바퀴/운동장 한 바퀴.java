import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();	// 직사각형 가로길이
		int d2 = sc.nextInt();	// 반지름 길이
        double pi = 3.141592;
        
        System.out.println(d1*2 + 2*pi*d2);
	}
}

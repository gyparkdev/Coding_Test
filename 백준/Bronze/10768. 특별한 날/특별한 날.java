import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt();
        if (m < 2) {
            System.out.println("Before");
        }else if (m == 2){
        	if (d < 18) {
        		System.out.println("Before");
        	}else if (d > 18) {
                System.out.println("After");
        	}else {
                System.out.println("Special");
        	}
        }else {
            System.out.println("After");
        }
	}
}

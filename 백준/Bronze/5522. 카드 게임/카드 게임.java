import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int [] a = new int[5];
    	int sum = 0;
    	
    	for(int i=0; i<5; i++) {
    		a[i] = sc.nextInt();
    		sum += a[i];
    	}
    	System.out.println(sum);
    }
}

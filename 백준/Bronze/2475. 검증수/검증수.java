import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int arr[] = new int[5];
		
		for(int i=0; i <arr.length; i++) {
			arr[i] = sc.nextInt();
			cnt += (arr[i] * arr[i]);
		}
		
		System.out.println(cnt%10);
	} 
}

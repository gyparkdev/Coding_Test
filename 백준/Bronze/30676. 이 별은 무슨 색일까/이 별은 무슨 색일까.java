import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N >= 620) {
			System.out.println("Red");
		}else if(N >= 590) {
			System.out.println("Orange");
		}else if(N >= 570) {
			System.out.println("Yellow");
		}else if(N >= 495) {
			System.out.println("Green");
		}else if(N >= 450) {
			System.out.println("Blue");
		}else if(N >= 425) {
			System.out.println("Indigo");
		}else if(N >= 380) {
			System.out.println("Violet");
		}
	}
}

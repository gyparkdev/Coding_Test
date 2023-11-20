import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		if(str.equals("M")) {
			System.out.println("MatKor");
		}
		if(str.equals("W")) {
			System.out.println("WiCys");
		}
		if(str.equals("C")) {
			System.out.println("CyKor");
		}
		if(str.equals("A")) {
			System.out.println("AlKor");
		}
		if(str.equals("$")) {
			System.out.println("$clear");
		}
	} 
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLowerCase(c)) {
				System.out.print(Character.toUpperCase(c));
			}else {
				System.out.print(Character.toLowerCase(c));
			}
		}
	}

}

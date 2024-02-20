import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] str = sc.nextLine().split(" ");
			if (str[0].equals("0") && str[1].equals("0"))
				break;
			System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
		}
		sc.close();
	}
}
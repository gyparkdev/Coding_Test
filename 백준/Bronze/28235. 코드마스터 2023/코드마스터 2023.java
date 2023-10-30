import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str1 = "SONGDO";
		String str2 = "CODE";
		String str3 = "2023";
		String str4 = "ALGORITHM";
		
		if(str.equals(str1)) {
			System.out.println("HIGHSCHOOL");
		}else if(str.equals(str2)) {
			System.out.println("MASTER");
		}else if(str.equals(str3)) {
			System.out.println("0611");
		}else if(str.equals(str4)) {
			System.out.println("CONTEST");
		}
	}
}
import java.util.Scanner;

public class Main { 
	
	public static void main(String[] args){ 
		
		char[] mobisChars = {'M', 'O', 'B', 'I', 'S'};
		
		//입력받기
		Scanner sc = new Scanner(System.in);		
		String word = sc.nextLine();
		
		//결과 출력
		boolean result = true;
		
		for(char mobisChar : mobisChars) {
			if(word.indexOf(mobisChar) == -1) {
				result = false;
				break;
			}
		}
		
		if(result) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	} 
}
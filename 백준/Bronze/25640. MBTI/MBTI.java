import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		String MBTI = sc.next();
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			String MBTIS = sc.next();
			if(MBTI.equals(MBTIS)) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}
}
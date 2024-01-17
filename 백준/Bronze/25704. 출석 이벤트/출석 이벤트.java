import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 
    
	public static void main(String[] args) throws NumberFormatException, IOException { 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 int p = Integer.parseInt(br.readLine());
		 int min = p;	// 할인쿠폰 적용받지 못했을 때가 default 값
        
		 for (int i = 1; i <= 4; i++) {	// i는 1~4로 각각 출석도장 5,10,15,20개를 의미
		     if (i*5>n) break;	// i*5가 출석도장의 수로, 해당 수보다 n이 작다면 종료
		     switch (i) {
		         case 1 : min = Math.min(min, p-500); break;	// 출석도장5개 처리
		         case 2 : min = Math.min(min, (int)(p*0.9)); break;	// 출석도장10개 처리
		         case 3 : min = Math.min(min, p-2000); break;	// 출석도장15개 처리
		         case 4 : min = Math.min(min, (int)(p*0.75)); break;	// 출석도장20개 처리
		     }
		 }
		 System.out.println(min<0?0:min);	// 할인 금액이 물건의 가격보다 더 큰 경우를 처리
	}
}
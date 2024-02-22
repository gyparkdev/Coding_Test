import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            String cur = scanner.nextLine();
            sb.append(cur.toLowerCase()).append('\n');
            n--;
        }
        System.out.print(sb);
        scanner.close();
    }
}
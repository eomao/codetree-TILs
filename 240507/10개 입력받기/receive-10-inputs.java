import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            n = sc.nextInt();
            if(n == 0){
                System.out.printf("%d %.1f", sum, (double)sum/cnt);
                break;
            }
            sum += n;
            cnt++;
            if(i == 9){
                System.out.printf("%d %.1f", sum, (double)sum/cnt);
            }
        }
    }
}
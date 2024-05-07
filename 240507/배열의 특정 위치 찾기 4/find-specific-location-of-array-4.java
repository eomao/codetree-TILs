import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n;
        int cnt = 0;
        int sum = 0;

        for(int i = 0; i < 10; i++){
            n = sc.nextInt();
            if(n == 0){
                System.out.print(cnt+" "+sum);
                break;
            }else if(n%2 == 0){
                sum += n;
                cnt++;
            }
            if(i == 9){
                System.out.print(cnt+" "+sum);
            }
        }
    }
}
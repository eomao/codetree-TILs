import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num, cnt = 0;

        for(int i = 0; i < n; i++){
            num = sc.nextInt();
            if(num == m){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
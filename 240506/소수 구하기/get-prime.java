import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean cnt = true;

        for(int i = 2; i <= n; i++){
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    cnt = false;
                }
            }
            if(cnt == true){
                System.out.print(i+" ");
            }
            cnt = true;
        }
    }
}
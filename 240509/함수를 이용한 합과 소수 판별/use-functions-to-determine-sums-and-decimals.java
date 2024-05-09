import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a, b, cnt = 0;

    static boolean ful(int a){
        if(a == 1){
            return false;
        }
        for(int j = 2; j < a; j++){
            if(a%j == 0){
                return false;
            }
        }
        int sum = 0;
        while(a%10 != 0){
            sum += a%10;
            a /= 10;
        }
        if(sum%2 != 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(ful(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
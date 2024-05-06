import java.util.Scanner;
public class Main {
    static int n,m;
    static void max(){
        for(int i = 100; i >= 1; i--){
            if(n%i == 0 && m%i == 0){
                System.out.print(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        max();
    }
}
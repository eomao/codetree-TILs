import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, m;

    static void input(){
        n = sc.nextInt();
        m = sc.nextInt();
    }

    static void cal(){
        for(int i = 1; i <= 10000; i++){
            if(i%n == 0&& i%m == 0){
                System.out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        input();
        cal();
    }
}
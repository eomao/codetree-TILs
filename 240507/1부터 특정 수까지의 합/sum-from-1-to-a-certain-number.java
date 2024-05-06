import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int plus = 0;

    static void add(){
        for(int i = 1; i <= n; i++){
            plus += i;
        }
    }

    static int div(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        n = sc.nextInt();
        add();
        int sum = plus;
        int result = div(plus, 10);
        System.out.print(result);


    }
}
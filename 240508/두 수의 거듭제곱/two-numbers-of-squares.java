import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a,b;

    static int mul(int a, int b){
        int result = 1;
        for(int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(mul(a, b));

    }
}
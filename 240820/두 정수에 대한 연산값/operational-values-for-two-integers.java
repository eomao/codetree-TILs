import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a, b;
    static boolean bigger;
    static boolean big(int a, int b){
        if(a > b){
            return true;
        }
        return false;
    }
    static int bignum(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
    static int smallnum(int a, int b){
        if(a > b){
            return b;
        }
        return a;
    }
    static void cal(int a, int b){
        a += 25;
        b *= 2;
        if(bigger){
            System.out.print(a+" "+b);
        }else{
            System.out.print(b+" "+a);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        a = sc.nextInt();
        b = sc.nextInt();
        bigger = big(a, b);

        cal(bignum(a, b), smallnum(a, b));
    }
}
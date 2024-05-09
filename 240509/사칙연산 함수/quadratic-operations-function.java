import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a, c, result;
    static String o;

    static int plus(int a, int b){
        return a+b;
    }

    static int min(int a, int b){
        return a-b;
    }

    static int div(int a, int b){
        return a/b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        a = sc.nextInt();
        o = sc.next();
        c = sc.nextInt();

        if(o.equals("+")){
            result = plus(a, c);
        }else if(o.equals("-")){
            result = min(a, c);
        }else if(o.equals("/")){
            result = div(a, c);
        }else if(o.equals("*")){
            result = mul(a, c);
        }else{
            System.out.print("False");
        }
        System.out.print(a+" "+o+" "+c+" = "+result);
    }
    
}
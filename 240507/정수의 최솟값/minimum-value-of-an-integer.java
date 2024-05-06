import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int d,e,f;

    static int min(int a, int b, int c){
        if(a <= b&& a <= c){
            return a;
        }else if(b <= c){
            return b;
        }else{
            return c;
        }
    }

    public static void main(String[] args) {
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        int mini = min(d,e,f);
        System.out.print(mini);

    }
}
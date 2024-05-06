import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static boolean even;

    static boolean num(int a){
        if(a%2 == 0){
            if((a%10 + a/10)%5 == 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        n = sc.nextInt();
        even = num(n);
        if(even == true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}
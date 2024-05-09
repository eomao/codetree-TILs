import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a, b, cnt = 0;

    static boolean per(int a){
        if(a%2 == 0){
            return false;
        }else if(a%10 == 5){
            return false;
        }else if(a%3 == 0&&a%9 != 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(per(i)){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}
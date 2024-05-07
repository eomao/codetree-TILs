import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int y;

    static boolean year(int a){
        if(a%4 != 0){
            return false;
        }else if(a%400 != 0){
            if(a%100 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        y = sc.nextInt();
        
        if(year(y)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }

    }
}
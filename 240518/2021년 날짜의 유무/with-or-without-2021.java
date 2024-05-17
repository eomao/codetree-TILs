import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static boolean year(int m, int d){
        if(m < 13&& d < 29){
            return true;
        }else if(d < 31&& m!= 2&&m <13){
            return true;
        }else if(d==31){
            if(m%2 == 1&& m < 8){
                return true;
            }else if(m%2 == 0&& m < 13&& m > 7){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(year(m, d)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        

    }
}
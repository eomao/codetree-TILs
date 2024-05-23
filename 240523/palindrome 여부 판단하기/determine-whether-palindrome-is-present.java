import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static boolean palindrome(String a){
        for(int i = 0; i < a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String str = sc.next();

        if(palindrome(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
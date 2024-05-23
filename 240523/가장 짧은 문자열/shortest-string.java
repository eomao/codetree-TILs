import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 20;

        for(int i = 0; i < 3; i++){
            String str = sc.next();
            if(max < str.length()){
                max = str.length();
            }
            if(min > str.length()){
                min = str.length();
            }
        }
        System.out.println(max-min);
    }
}
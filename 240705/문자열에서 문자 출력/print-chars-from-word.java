import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
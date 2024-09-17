import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] list = new char[word.length()];
        for(int i = 0; i < word.length(); i++){
            list[i] = word.charAt(i);
            if(i != 1&& i != word.length()-2){
                System.out.print(list[i]);
            }
        }
    }
}
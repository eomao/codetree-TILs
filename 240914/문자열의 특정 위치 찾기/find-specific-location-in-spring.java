import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char[] list = new char[word.length()];
        for(int i = 0; i < word.length(); i++){
            list[i] = word.charAt(i);
        }
        String ch = sc.next();
        char ar = ch.charAt(0);

        for(int i = 0; i < word.length(); i++){
            if(list[i]== ar){
                System.out.println(i);
                break;
            }else if(i == word.length()-1){
                System.out.println("No");
            }
        }
        }
}
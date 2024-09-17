import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] list = new char[word.length()];
        char tag = word.charAt(1);
        char edit = word.charAt(0);
        for(int i = 0; i < word.length(); i++){
            list[i] = word.charAt(i);
            if(list[i] == tag){
                list[i] = edit;
            }
            System.out.print(list[i]);
        }

    }
}
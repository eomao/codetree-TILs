import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        char[] line = new char[word2.length()];
        for(int i = 0; i < word2.length(); i++){
            if(i<2){
                line[i] = word1.charAt(i);
            }else{
                line[i] = word2.charAt(i);
            }
            System.out.print(line[i]);

        }

    }
}
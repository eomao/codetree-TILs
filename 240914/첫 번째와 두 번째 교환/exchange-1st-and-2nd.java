import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char tag1, tag2;
        String word = sc.next();
        tag1 = word.charAt(0);
        tag2 = word.charAt(1);
        char[] line = new char[word.length()];

        for(int i = 0; i < word.length(); i++){
            line[i] = word.charAt(i);
            if(line[i] == tag1){
                line[i] = tag2;
            }else if(line[i] == tag2){
                line[i] = tag1;
            }
            System.out.print(line[i]);
        }
    }
}
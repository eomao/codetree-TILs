import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        for(int i = line.length()-1; i > 0; i--){
            if(line.length()%2 == 0){
                if(i%2 == 1){
                    System.out.print(line.charAt(i));
                }
            }else{
                if(i%2 == 0){
                    System.out.print(line.charAt(i));
                }
            }
        }
    }
}
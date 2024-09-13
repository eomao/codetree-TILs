import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String line = sc.next();
        String tag = sc.next();
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i)==tag.charAt(0)&&line.charAt(i+1)==tag.charAt(1)){
                cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }
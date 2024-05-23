import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str = sc.nextLine();
        String al = sc.next();
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == al.charAt(0)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
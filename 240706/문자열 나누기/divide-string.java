import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String line = "";

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
            line += arr[i];
        }
        int cnt = 0;
        while(true){
            for(int i = cnt*5; i < (cnt*5)+5; i++){
                System.out.print(line.charAt(i));
                if(i==line.length()-1){
                    break;
                }
            }
            System.out.println();
            cnt++;
            if(cnt*5 > line.length())
            break;
        }
    }
}
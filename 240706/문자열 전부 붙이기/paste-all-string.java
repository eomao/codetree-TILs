import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String line = "";
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
            line += arr[i];
        }
        System.out.print(line);
    }
}
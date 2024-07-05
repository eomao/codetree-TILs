import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int length = 0;
        String[] arr = new String[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
            length += arr[i].length();
        }

        System.out.print(length);

    }
}
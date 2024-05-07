import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[n];
        int num;

        for(int i = 0; i < n; i++){
            num = sc.nextInt();
            if(num%2 == 0){
                arr[cnt] = num;
                cnt++;
            }
        }
        for(int j = cnt-1; j >= 0; j--){
            System.out.print(arr[j]+" ");
        }
    }
}
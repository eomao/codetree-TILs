import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){
         for(int j = 0; j < 4; j++){
            arr[j] = sc.nextInt();
            sum += arr[j];
         }   
         if(sum/4 >= 60){
            cnt++;
            System.out.println("pass");
         }else{
            System.out.println("fail");
         }
         sum = 0;
        }
        System.out.println(cnt);

    }
}
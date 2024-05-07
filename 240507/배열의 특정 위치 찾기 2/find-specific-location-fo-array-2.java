import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int cnt = 0;
        int sum = 0;
        int[] newArr = new int[5];
        int newCnt = 0;
        int newSum = 0;

        for(int i = 0; i < 10; i++){
            if(i%2 == 0){
                arr[cnt] = sc.nextInt();
                cnt++;
                sum += arr[cnt-1];
            }else{
                arr[newCnt] = sc.nextInt();
                newCnt++;
                newSum += arr[newCnt-1];
            }
        }

        if(sum >= newSum){
            System.out.print(sum - newSum);
        }else{
            System.out.print(newSum - sum);
        }
    }
}
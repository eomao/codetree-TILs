import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -2147483648, scmax = -2147483648;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >= max){
                scmax = max;
                max = arr[i];
            }else if(arr[i]>= scmax){
                scmax = arr[i];
            }
        }
        System.out.print(max+" "+scmax);
    }
}
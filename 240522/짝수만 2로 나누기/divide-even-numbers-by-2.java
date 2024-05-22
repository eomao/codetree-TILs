import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static void div(int[] arr, int n){
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                arr[i] /= 2;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int[] arr = new int[n];

        div(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
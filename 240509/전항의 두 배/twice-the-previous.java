import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 2; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        for(int j = 2; j < 10; j++){
            arr[j] = arr[j-1]+arr[j-2]*2;
            System.out.print(arr[j]+" ");
        }

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = sc.nextInt();
        int i = 2;
        System.out.print(arr[0]+" "+arr[1]+" ");

        while(true){
            arr[i] = arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
            if(arr[i] > 100){
                break;
            }
            i++;
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int n;

        for(int i = 0; i < 10; i++){
            n = sc.nextInt();
            arr[n-1]++; 
        }
        for(int j = 0; j < 6; j++){
            System.out.println(j+1+" - "+arr[j]);
        }
    }
}
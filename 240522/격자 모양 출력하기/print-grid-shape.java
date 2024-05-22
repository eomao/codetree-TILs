import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        int a, b;

        for(int i = 0; i < m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            arr[a-1][b-1] = a*b;
        }

        for(int r = 0; r < n; r++){
            for(int c = 0; c< n; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }

    }
}
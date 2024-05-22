import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int cnt = 1;
        int row = 0;

        for(int col = 0; col < m; col++){
            for(int i = 0; i <= col&& i< n; i++){
               arr[row+i][col-i] = cnt;
               cnt++; 
            }
        }
        row = 1;
        int col1 = m-1;
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < i&&j <=m-1; j++){
                arr[row+j][col1-j] = cnt;
                cnt++;
            }
            row++;
        }

        for(int row1 = 0; row1 < n; row1 ++){
            for(int col = 0; col < n; col++){
                System.out.print(arr[row1][col]+" ");
            }
            System.out.println();
        }
    }
}
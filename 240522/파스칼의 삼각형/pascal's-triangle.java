import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        System.out.println(arr[0][0]);

        for(int row = 1; row < n; row++){
            for(int col = 0; col <= row; col++){
                if(col == 0){
                    arr[row][col] = 1;
                }else{
                    arr[row][col] = arr[row-1][col-1] + arr[row-1][col];
                }
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
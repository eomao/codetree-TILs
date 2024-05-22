import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                if(r == 0|| c == 0){
                    arr[r][c] = 1;
                }else{
                    arr[r][c] = arr[r-1][c-1]+arr[r-1][c]+arr[r][c-1];
                }
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
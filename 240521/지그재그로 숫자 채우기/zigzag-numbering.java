import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int[][] arr = new int[n][m];

        for(int col = 0; col < m; col++){
            for(int row = 0; row < n; row++){
                arr[row][col] = cnt;
                if(col%2 == 0){
                    if(row == n-1){
                        cnt+= n;
                    }else{
                        cnt++;
                    }
                }else{
                    if(row == n-1){
                        cnt+=n;
                    }else{
                        cnt--;
                    }
                }
            }
        }
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int[][] arr = new int[n][n];
        for(int col = n-1; col >= 0; col--){
            if(n%2 == 0){
                if(col%2 == 1){
                    for(int row = n-1; row >= 0; row--){
                        arr[row][col] = cnt;
                        cnt++;
                    }
                }else{
                    for(int row = 0; row < n; row++){
                        arr[row][col] = cnt;
                        cnt++;
                    }
                }
            }else{
                if(col%2 == 0){
                    for(int row = n-1; row >= 0; row--){
                        arr[row][col] = cnt;
                        cnt++;
                    }
                }else{
                    for(int row = 0; row < n; row++){
                        arr[row][col] = cnt;
                        cnt++;
                    }
                }

            }
        }

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
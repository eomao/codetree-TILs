import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] arr3 = new int[n][m];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                arr1[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                arr2[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(arr1[row][col]== arr2[row][col]){
                    arr3[row][col] = 0;
                }else{
                    arr3[row][col] = 1;
                }
                System.out.print(arr3[row][col]+" ");
            }
            System.out.println();
        }

    }
}
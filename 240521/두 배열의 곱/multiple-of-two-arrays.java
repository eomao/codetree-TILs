import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                arr1[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                arr2[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(arr1[row][col]*arr2[row][col]+" ");
            }
            System.out.println();
        }
        
    }
}
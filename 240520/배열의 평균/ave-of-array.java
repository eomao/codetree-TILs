import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int sum = 0;

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 4; col++){
                arr[row][col] = sc.nextInt();
                sum += arr[row][col];
            }
        }
        System.out.printf("%.1f %.1f\n", (double)(arr[0][0]+arr[0][1]+arr[0][2]+arr[0][3])/4, (double)(arr[1][0]+arr[1][1]+arr[1][2]+arr[1][3])/4);
        System.out.printf("%.1f %.1f %.1f %.1f\n",(double)(arr[0][0]+arr[1][0])/2, (double)(arr[0][1]+arr[1][1])/2, (double)(arr[0][2]+arr[1][2])/2, (double)(arr[0][3]+arr[1][3])/2);
        System.out.printf("%.1f\n", (double)sum/8);
    }
}
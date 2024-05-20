import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[][] arr = new int[4][4];

        for(int row = 0; row < 4; row ++){
            for(int col = 0; col < 4; col++){
                arr[row][col] = sc.nextInt();
                if(col <= row){
                    sum += arr[row][col];
                }
            }
        }
        System.out.print(sum);
    }
}
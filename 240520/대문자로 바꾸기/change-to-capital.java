import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][3];

        for(int row = 0; row < 5; row++){
            for(int col = 0; col < 3; col++){
                arr[row][col] = sc.next().charAt(0);
                arr[row][col] += 'A'-'a';
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
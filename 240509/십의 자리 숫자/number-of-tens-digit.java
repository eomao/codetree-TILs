import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int n;

        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            if(n/10 != 0){
                arr[n/10-1]++;
            }
        }
        for(int i = 0; i < 9; i++){
            System.out.println(i+1+" - "+arr[i]);
        }
    }
}
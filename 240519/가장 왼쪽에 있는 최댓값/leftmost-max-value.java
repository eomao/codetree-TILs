import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 1, mark = n;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        while(true){
            for(int i = 0; i < n; i++){
                if(arr[i] > max){
                    max = arr[i];
                    mark = i;
                }
                
            }
            System.out.print(mark+1+" ");
                n = mark;
                max = 1;
            if(mark == 0){
                break;
            }
        }
    }
}
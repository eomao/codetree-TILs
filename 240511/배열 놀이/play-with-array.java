import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int num, num1, num2;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < q; j++){
            num = sc.nextInt();
            if(num == 1){
                num1 = sc.nextInt();
                System.out.println(arr[num1-1]);
            }else if(num == 2){
                num1 = sc.nextInt();
                for(int i = 0; i < n; i++){
                    if(arr[i]==num1){
                        System.out.println(i+1);
                        break;
                    }else if(i == n-1){
                        System.out.println(0);
                    }
                }
            }else{
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                for(int k = num1; k <= num2; k++){
                    System.out.print(arr[k-1]+" ");
                }
                System.out.println();
            }
            
        }
        }
}
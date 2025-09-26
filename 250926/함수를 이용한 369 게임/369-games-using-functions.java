import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        for(int i = A; i<= B; i++){
            int num = i;
            if(i%3 == 0){
                cnt++;
            }else{
                while(num > 0){
                    if(num%10 == 3 || num%10 == 6 || num%10 == 9){
                        cnt++;
                        break;
                    }
                    num /= 10;
                }
            }
        }
        System.out.print(cnt);
        // Please write your code here.

    }
}
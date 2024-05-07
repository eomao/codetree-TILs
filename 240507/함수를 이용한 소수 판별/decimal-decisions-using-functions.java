import java.util.Scanner;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static int a,b;
        static int sum = 0;

        static boolean ful(int n){
            if(n == 1){
                return false;
            }
            for(int j = 2; j < n; j++){
                if(n%j == 0){
                    return false;
                }
            }
            return true;
        }
        
        public static void main(String[] args){
            a = sc.nextInt();
            b = sc.nextInt();

            for(int i = a; i <= b; i++){
                if(ful(i)){
                    sum += i;
                }
            }
            System.out.print(sum);
        }


}
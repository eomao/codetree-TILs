import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static boolean num(int z){
        while(true){
            if(z%10 == 3||z%10 == 6|| z%10 == 9){
                return true;
            }else if(z/10 == 0){
                return false;
            }else{
                z /= 10;
            }
        }
    }

    static int tri(int x, int y){
        int cnt = 0;
        for(int i = x; i <= y; i++){
            if(i%3 == 0|| num(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = tri(a,b);
        System.out.print(result);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int max = 1, min = 1000, n;
        for(int i = 0; i < 10; i++){
            n = sc.nextInt();
            if(n > 500){
                if(n < min){
                    min = n;
                }
            }else{
                if(n > max){
                    max = n;
                }
            }
        }
        System.out.print(max+" "+min);
    }
}
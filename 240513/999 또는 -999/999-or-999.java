import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num, min = 999, max = -999;

        while(true){
            num = sc.nextInt();
            if(num == 999|| num == -999){
                System.out.print(max+" "+min);
                break;
            }
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
    }
}
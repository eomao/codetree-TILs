import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        String word = sc.next();
        int sum = 0;
        int cnt = 0;
        for(int j = 0; j < n; j++){
            if(arr[j].charAt(0) == word.charAt(0)){
                cnt++;
                sum += arr[j].length();
            }
        }
        if(cnt == 0){
            System.out.print("0 0.00");
        }else{
            System.out.printf("%d %.2f", cnt, (float)sum/cnt);
        }
    }
}
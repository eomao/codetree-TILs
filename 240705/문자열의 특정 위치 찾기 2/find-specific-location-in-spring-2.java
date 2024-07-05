import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange"};
        String word = sc.next();
        char ch = word.charAt(0);
        int cnt = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 2; j <4; j++){
                if(arr[i].charAt(j)==ch){
                    System.out.println(arr[i]);
                    cnt++;
                    break;
                }
            }
        }

        System.out.print(cnt);



    }
}
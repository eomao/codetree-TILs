import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }
        String word = sc.next();
        boolean exist = false;
        for(int j = 0; j < 10; j++){
            if(arr[j].charAt(arr[j].length()-1) == word.charAt(0)){
                System.out.println(arr[j]);
                exist = true;
            }
        }
        if(exist == false){
            System.out.print("None");
        }
    }
}
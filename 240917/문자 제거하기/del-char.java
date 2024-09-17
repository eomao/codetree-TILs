import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        while(true){
            if(word.length() == 1){
                break;
            }
            int tag = sc.nextInt();
            if(tag >= word.length()){
                word = word.substring(0,word.length()-1);
            }else if(tag == 0){
                word = word.substring(1);
            }else{
                word = word.substring(0,tag)+ word.substring(tag+1);
            }
            System.out.println(word);
        }
    }
}
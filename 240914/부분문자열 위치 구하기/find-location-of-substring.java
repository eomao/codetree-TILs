import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mark = -1;
        String line = sc.next();
        String tag = sc.next();
        for(int i = 0; i < line.length()-1; i++){
            if(line.charAt(i)==tag.charAt(0)){
                for(int j = 1; j < tag.length(); j++){
                    if(line.charAt(i+j)!=tag.charAt(j)){
                        break;
                    }else if(j==tag.length()-1){
                        mark = i;
                    }
                }
            }
        }
        System.out.println(mark);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mark = -1;
        String line = sc.next();
        String tag = sc.next();
        if (line.equals(tag)) {
            System.out.println(-1);
            return; // 프로그램 종료
        }
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i)==tag.charAt(0)&&i+tag.length()<line.length()){
                for(int j = 0; j < tag.length(); j++){
                    if(line.charAt(i+j)!=tag.charAt(j)){
                        break;
                    }else if(j==tag.length()-1){
                        mark = i;
                    }
                }
                if(mark != -1){
                    break;
                }
            }
        }
        System.out.println(mark);
    }
}
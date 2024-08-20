import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        boolean inc1 = false, inc2 = false;

        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i)== 'e'){
                
                if(line.charAt(i+1) == 'e'){
                    inc1 = true;
                }
            }
        }
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == 'a'){
                if(line.charAt(i+1) == 'b'){
                    inc2 = true;
                }
            }
        }
        System.out.print(inc1+" "+inc2);


    }
}
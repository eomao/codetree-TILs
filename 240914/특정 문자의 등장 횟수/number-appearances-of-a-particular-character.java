import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int cntee = 0;
        int cnteb = 0;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int num = word.length();
        char[] line = new char[num];
        for(int i = 0; i < num; i++){
            line[i] = word.charAt(i);
        }
        for(int i = 0; i < num; i++){
            if(i != num-1){
                if(line[i]=='e'){
                    if(line[i+1]=='e'){
                        cntee++;
                    }else if(line[i+1]=='b'){
                        cnteb++;
                    }

                }
            }
        }
        System.out.print(cntee+" "+cnteb);

    }
}
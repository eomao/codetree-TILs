import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int Long = word.length();
        char[] line = new char[Long];
        for(int i = 0; i < Long; i++){
            line[i] = word.charAt(i);
        }
        int rep = sc.nextInt();
        for(int i = 0; i < rep; i++){
            int j = sc.nextInt();
            if(j == 1){
                int tag = sc.nextInt();
                int tag2 = sc.nextInt();
                char temp = line[tag-1];
                line[tag-1] = line[tag2-1];
                line[tag2-1] = temp;
            }else if(j == 2){
                String one = sc.next();
                String two = sc.next();
                char oneword = one.charAt(0);
                char twoword = two.charAt(0);
                for(int k = 0; k < Long; k++){
                    if(line[k] == oneword){
                        line[k] = twoword;
                    }else if(line[k] == twoword){
                        line[k] = oneword;
                    }
                }
            }
            for(int o = 0; o < Long; o++){
                System.out.print(line[o]);
            }
            System.out.println();
        }

    }
}
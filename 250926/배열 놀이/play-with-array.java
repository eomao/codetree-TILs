import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] num = new int[N];
        int question;
        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < Q; i++){
            question = sc.nextInt();
            q(num, question, N);
        }
        // Please write your code here.
    }
    public static void q(int[] num, int question, int N){
        int a, b, s, e;
        if(question == 1){
            a = sc.nextInt();
            System.out.println(num[a-1]);
        }else if(question == 2){
            b = sc.nextInt();
            for(int i = 0; i < N; i++){
                if(num[i] == b){
                    System.out.println(i+1);
                    return;
                }
            }
            System.out.println("0");
        }else{
            s = sc.nextInt()-1;
            e = sc.nextInt()-1;
            for(int i = s; i <= e; i++){
                System.out.print(num[i]+" ");
            }
            System.out.println();
        }

    }
}
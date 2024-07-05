import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, maxin = n, memory = 0;
        int[] arr = new int[n];

        for(int i = 0; i < maxin; i++){
            arr[i] = sc.nextInt();
        }

        while(true){    
            for(int i = 0; i < maxin; i++){
                if(max < arr[i]){
                    max = arr[i];
                    memory = i+1;
                }
            }
            maxin = memory-1;
            max = 0;
            System.out.print(memory+" ");
            if(memory == 1){
                break;
            }
        }


    }
}
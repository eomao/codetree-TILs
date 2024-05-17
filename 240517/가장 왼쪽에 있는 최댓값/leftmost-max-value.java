import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mark = 0, max = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken()); 
        }

        while(n+1 != 1){
            for(int i = 0; i < n; i++){
                if(arr[i] > max){
                    mark = i;
                    max = arr[i];
                }

            }
            System.out.print(mark+1+" ");
            n = mark;
            max = 1;
        }



    }
}
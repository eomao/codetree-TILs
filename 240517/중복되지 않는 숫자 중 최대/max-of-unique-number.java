import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = -1;
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int j = 0; j < n; j++){
            for(int k = 0; k < n; k++){
                if(j != k&& arr[j] == arr[k]){
                    break;
                }
                if(k == n-1&& arr[j] > max){
                    max = arr[j];
                }
            }
        }
        System.out.print(max);

    }
}
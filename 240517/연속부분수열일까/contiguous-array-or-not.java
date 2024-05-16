import java.io.*; 
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n1; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < n2; j++){
            arr2[j] = Integer.parseInt(st.nextToken());
        }

        int num1 = 0;
        int num2 = 0;

        boolean isOk = false;

        while(num1 <= n1 - n2){
            if(arr1[num1] == arr2[0]){
                for(num2 = 1; num2 < n2; num2++){
                    if(arr1[num1 + num2] != arr2[num2]){
                        num2 = 0;
                        break;
                    }
                }
                //여기까지 오면 성공
                if(num2 == n2){
                    isOk = true;
                    break;
                }
            }
            num1++;
        }

        if(isOk == true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        

    }
}
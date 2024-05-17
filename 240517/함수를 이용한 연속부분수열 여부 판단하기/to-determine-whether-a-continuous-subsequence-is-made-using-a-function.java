import java.util.*;
import java.io.*;
public class Main{
    static boolean checkNum(int num1, int num2, int[] array1, int[] array2){
        int cnt = 0;
        while(cnt <= num1- num2){
            if(array1[cnt] == array2[0]){
                for(int i = 1; i < num2; i++){
                    if(array1[cnt+i] != array2[i]){
                        break;
                    }
                    if(i == num2-1){
                        return true;
                    } 
                }
            }
            cnt++;

        }
        return false;

    }

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        StringTokenizer sti = new StringTokenizer(br.readLine());
        for(int i = 0; i < n1; i++){
            arr1[i] = Integer.parseInt(sti.nextToken());
        }
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n2; i++){
            arr2[i] = Integer.parseInt(str.nextToken());
        }

        if(checkNum(n1, n2, arr1, arr2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
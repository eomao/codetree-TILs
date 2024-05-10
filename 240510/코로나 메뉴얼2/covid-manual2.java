import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String sym;
        int temp, cnt = 0;
        int[] arr = new int[4];


        for(int i = 0; i < 3; i++){
            sym = sc.next();
            temp = sc.nextInt();
            if(sym.equals("Y")){
                if(temp >= 37){
                    arr[0]++;
                    cnt++;
                }else{
                    arr[2]++;
                }
            }else{
                if(temp >= 37){
                    arr[1]++;
                }else{
                    arr[3]++;
                }
            }
        }
        for(int j = 0; j < 4; j++){
            System.out.print(arr[j]+" ");
        }
        if(cnt >= 2){
            System.out.print("E");
        }
    }
}
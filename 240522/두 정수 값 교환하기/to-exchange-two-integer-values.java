import java.util.Scanner;
class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}


public class Main{
    static Scanner sc = new Scanner(System.in);
    static int temp;
    public static void swap(IntWrapper n, IntWrapper m){
            temp = n.value;
            n.value = m.value;
            m.value = temp;
    }
       
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        IntWrapper nWrapper = new IntWrapper(n);
        IntWrapper mWrapper = new IntWrapper(m);

        swap(nWrapper, mWrapper);
        n = nWrapper.value;
        m = mWrapper.value;

        System.out.println(n+" "+m);
    }
    
    }
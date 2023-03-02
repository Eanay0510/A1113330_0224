import java.util.*;

public class A1113330_0224_1{
    public static void main(String[] argv){
        int s;
        System.out.print("請輸入整數");
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        if(s%2 == 0){
            System.out.println("此整數為偶數");
        }
        if(s%2 != 0){
            System.out.println("此整數為奇數");
        }        
    }
}
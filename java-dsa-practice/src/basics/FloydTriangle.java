package basics;
import java.util.*;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=1;
        System.err.println("Floyd's Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((digit++)+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

package basics;
import java.util.Scanner;
public class DecimalToBinary {
    static String decimalToBinary(int n){
    StringBuilder sb=new StringBuilder();
    while(n>0){
        int d=n%2;
        sb.append((char)('0'+d));
        n/=2;
    }
    sb.reverse();
    return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(decimalToBinary(n));
    }
    
}

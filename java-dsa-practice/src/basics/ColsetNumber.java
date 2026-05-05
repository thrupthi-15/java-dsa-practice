package basics;
import java.util.*;
public class ColsetNumber {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int n1,n2;
        int q=n/m;
        n1=m*q;
        if(n*m > 0){
            n2=m*(q+1);
        }else{
            n2=m*(q-1);
        }
        if(Math.abs(n-n1)<Math.abs(n-n2)){
           System.out.println(n1);
        }else{
           System.out.println(n2); 
        }
    sc.close();

    }
 }
    
}

package basics;
import java.util.Scanner;
public class SumOfNatural{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Natural Number");
    int n=sc.nextInt();
    //Naive approach
    
    /**int sum=0;
    for(int i=1;i<=n;i++){
    sum+=i;
    }
    **/

    //formula based
    int sum=0;
    sum=(n*(n+1))/2;
    System.out.println("Sum of "+n+" Natural Number is "+sum);
 }
}
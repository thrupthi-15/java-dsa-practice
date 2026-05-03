package basics;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        // Check if the number is divisible by 2
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        // Close the scanner       
    reader.close();
    }
}

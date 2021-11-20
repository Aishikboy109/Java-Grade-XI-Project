/**
 * Q1
 * Decimal to Binary Conversion
 */
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        //User Input
        int a = sc.nextInt();
        int n = a;
        String res = "";
        while(a > 0){
            //Dividing the number by two
            int rem = a%2;
            //Converting the remainder into a string
            String remainder = Integer.toString(rem);
            //Concatinating the remainder to the final result
            res = remainder + res;
            a /= 2;
        }
        //Printing out the Binary Equivalent
        System.out.println("Binary Equivalent of " + n + " is : " + res);
    }
}
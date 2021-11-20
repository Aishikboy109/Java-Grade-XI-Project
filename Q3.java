//Fibonacci Series using Recursion

import java.net.Socket;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }    

    static int fibonacci(int n){
        return ((n<=1)? n : fibonacci(n-1) + fibonacci(n-2) );
    }
}

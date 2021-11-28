import java.util.Scanner;

class Q17 {
    //finding factorial using recursion
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }    
    static int factorial(int n) {
        //base case
        if (n == 0) {
            return 1;
        }
        //recursive case
        return n * factorial(n - 1);
    }
}

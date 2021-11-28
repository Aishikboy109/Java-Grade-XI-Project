import java.util.Scanner;

public class Q20 {
    static int len = 5;
    static int arr[][] = new int[len][len];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.useDelimiter("\s");
        System.out.println("Enter the elements of the array");

        //user input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        //displaying the array
        System.out.print("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            System.out.print("               ");
        }
        System.out.println();
        //adding up the elements of the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }

        //displaying the sum of the elements of the array
        System.out.println("The sum of the elements of the array is " + sum);

    }
}

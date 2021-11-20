import java.util.Arrays;
import java.util.Scanner;

class Q7{
    static int arr[] = {1,3,2,5,4};
    public static void main(String[] args) {
        System.out.println("Enter the integers : ");        
        // int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        //user input
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        
            // printing out original array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + ", ");
        // }
        // System.out.println();
       pendulumArrangement(arr,5);

    }

    static void pendulumArrangement(int arr[], int n){
        //Sorting the array
        sort(arr);
        //Creating an array to store the outputs
        int outputs[] = new int[n];
        //Middle index
        int mid = (n-1)/2;

        /* storing the minimum element in the middle
           i is the index for output array and j is for input array.
        */

        int j = 1, i = 1;
        outputs[mid] = arr[0];

        for (i = 1; i <= mid; i++) {
            outputs[mid+i] = arr[j++];
            outputs[mid-i] = arr[j++];
        }

        // adjustment for when no. of elements is even
        if(n%2==0){
            outputs[mid+i] = arr[j];
        }

        //printing out the pendulum arrangement
        for ( i = 0; i < n; i++) {
            System.out.print(outputs[i] + ", ");
        }
        System.out.println();

    }
    static int[] sort(int arr[]){
        int n = arr.length;
        //Sorting the array
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                //Checking whether the value at position 'j' is smaller than the value at 'min_index'
                if(arr[j] < arr[min_index]){
                    min_index= j;
                }
            }

            //swapping the elements
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
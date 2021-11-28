import java.util.Scanner;

public class Q18 {
    //Linear Searching an array
    static int arr[];
    public static void main(String[] args) {
        getUserInput();
    }

    static void getUserInput(){
        //user input
        //Prompting the user to enter the size of the array
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        //Prompting the user to enter the elements of the array
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //Prompting the user to enter the element to be searched
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        //calling the linearSearch method
        int index = linearSearch(element);
        //default fallback
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+index);
        }
    }
    static int linearSearch(int element){
        for(int i=0;i<arr.length;i++){
            //iterating through the array, returning the index of the element if found
            if(arr[i] == element){
                return i;
            }
        }
        //otherwise returning -1 as fallback statement
        return -1;
    }
}

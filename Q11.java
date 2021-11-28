import java.util.Scanner;
public class Q11 {
    //Merging two arrays

    static Scanner sc = new Scanner(System.in);
    static int arr1[], arr2[];
    static int newArray[];
    public static void main(String[] args) {
        inputArrLength();
        inputElements();
        displayOriginal();
        mergeArrays();
        displayNewArray();
    }

    static void inputArrLength(){
        System.out.println("Enter the Length of Array 1 : ");
        int arr1Length = sc.nextInt();
        System.out.println("Enter the Length of Array 2 : ");
        int arr2Length = sc.nextInt();
        arr1 = new int[arr1Length];
        arr2 = new int[arr2Length];
    }
    static void inputElements(){
        System.out.println("Enter the elements of Array 1 : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of Array 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
    }
    
    static void displayOriginal(){
        // System.out.println("Original Arrays : ");
        System.out.print("Array 1 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Array 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    static void mergeArrays(){
        int newarr[] = new int[arr1.length + arr2.length];
        int c = 0;
        for (int i = 0; i < arr1.length; i++) {
            newarr[c++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newarr[c++] = arr2[i];
        }
        newArray = newarr;
    }

    static void displayNewArray(){
        System.out.print("Merged Array : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
        System.out.println();
    }
}
import java.util.Scanner;

/**
 * Q11
 */
public class Q11 {

    public static void main(String[] args) {


        //Inputting for user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of arrays : ");
        int noOfArrays = sc.nextInt();
        int listOfArrays[][] = new int[noOfArrays][];
        for (int i = 0; i < noOfArrays; i++) {
            System.out.println("Enter the size of array " + (i + 1) + " : ");
            int sizeOfArray = sc.nextInt();
            listOfArrays[i] = new int[sizeOfArray];
            System.out.println("Enter the elements of array " + (i + 1) + " : ");
            for (int j = 0; j < sizeOfArray; j++) {
                listOfArrays[i][j] = sc.nextInt();
            }
        }

        //Printing the arrays
        displayOriginal(listOfArrays);


        System.out.println("Total length : " + getTotatlLength(listOfArrays));


        //Creating the new array in which the original arrays will be merged
        int newArray[] = new int[getTotatlLength(listOfArrays)];
        //Merging the arrays
        int c = 0;
        for (int i = 0; i < listOfArrays.length; i++) {
            for (int j = 0; j < listOfArrays[i].length; j++) {
                newArray[c++] = listOfArrays[i][j];
                c++;
            }
        }

        //Printing the new array
        displayNewArray(newArray);
    }

    static void displayNewArray(int[] newArray) {
        System.out.print("New Array : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    static void displayOriginal(int[][] listOfArrays){
        for (int i = 0; i < listOfArrays.length; i++) {
            System.out.println("Array : " + i);
            for (int j = 0; j < listOfArrays[i].length; j++) {
                System.out.print(listOfArrays[i][j] + ", ");
            }
            System.out.println();
        }
    }
    static int getTotatlLength(int[][] listOfArrays) {
        int totalLength = 0;
        for (int i = 0; i < listOfArrays.length; i++) {
            for (int j = 0; j < listOfArrays[i].length; j++) {
                totalLength++;
            }
        }
        return totalLength;
    }
}
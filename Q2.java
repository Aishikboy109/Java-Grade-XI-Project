import java.util.Scanner;

import jdk.jfr.BooleanFlag;

//Check whether a number is a unique number

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        //taking user input as an integer and converting it into a string
        String a = Integer.toString(sc.nextInt());
        Boolean flag = true;

        for (int i = 0; i < a.length()-1; i++) {
            char c1 = a.charAt(i);
            for (int j = i+1; j < a.length(); j++) {
                char c2 = a.charAt(j);
                if(c1 == c2){
                    flag = false;
                    break;
                }
            }
        }

        if(!flag){
            System.out.println("It is not a Unique Number!");
        }else{
            System.out.println("It is a Unique Number!");
        }

    }
}

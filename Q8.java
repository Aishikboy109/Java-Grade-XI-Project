import java.util.Scanner;

public class Q8 {
    //Remove duplicate characters from a word

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //user input
        System.out.println("Enter the word : ");
        String word = sc.next();
        //Printing out the sanitized word
        System.out.println("Sanitized word : " + removeDuplicateChars(word));
    }

    static String removeDuplicateChars(String word){
        //Recursive Function for removing duplicate characters
       if(word.length()<=1){
           return word;
       }
       else if(word.charAt(0) == word.charAt(1)){
            return removeDuplicateChars(word.substring(1));
       }
       else{
           return word.charAt(0) + removeDuplicateChars(word.substring(1));
       }
    }
}

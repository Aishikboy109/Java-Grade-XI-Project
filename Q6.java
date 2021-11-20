import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q6 {
    public static void main(String args[]) throws IOException{
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sentences: "); //inputting the number of sentences to accept
        int n = sc.nextInt();
        String s = "";
 
        for(int i=1; i<=n; i++)
        {
            System.out.print("Enter Sentence "+i+": ");
            s = s + sc.nextLine(); //inputting multiple sentences and joining them in the same String
        }
         
        //converting the sentence into StringTokenizer giving the given punctuation marks
 
        StringTokenizer str=new StringTokenizer(s," '.,;:!?");
        int c=str.countTokens();
 
        String w="", rev="";
        for(int i=1; i<=c; i++)
        {
            w = str.nextToken(); //extracting one word at a time
            rev = w+" "+rev; //joining the extracted words in reverse order
        }
         
        System.out.println("Output: "+rev);
    }
}

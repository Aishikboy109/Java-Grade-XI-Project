import java.util.Scanner;

public class Q19
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        str = str.toLowerCase();
        int len = str.length();

        String sortedStr = ""; //Empty String
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < len; i++) {
                char strCh = str.charAt(i);
                if (ch == strCh) {
                    sortedStr += strCh;
                }
            }
        }
        
        System.out.println("Alphabetical order : " + sortedStr);
        
    }
}
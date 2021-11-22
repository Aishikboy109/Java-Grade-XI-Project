// Java program to check whether the
// given EMEI number is valid or not.
import java.io.*;
import java.util.Scanner;
class Q13
{
    //Java Program to check for valid IMEI Number
    // Function for finding and returning
	// sum of digits of a number
	static int sumDig(int n)
	{
		int a = 0;
		while (n > 0)
		{
			a = a + n % 10;
			n = n / 10;
		}
		return a;
	}

	static boolean isValidIMEI(long n)
	{
		// Converting the number into String
		// for finding length
		String s = Long.toString(n);
		int len = s.length();

		if (len != 15)
			return false;

		int sum = 0;
		for (int i = len; i >= 1; i--)
		{
			int d = (int)(n % 10);

			// Doubling every alternate digit
			if (i % 2 == 0)
				d = 2 * d;

			// Finding sum of the digits
			sum += sumDig(d);
			n = n / 10;
		}

		return (sum % 10 == 0);
	}

	// Driver code
	public static void main(String args[]) throws IOException
	{
		// 15 digits cannot be stored in 'int' data type
		long n;
        Scanner sc = new Scanner(System.in);

        //user input
        System.out.println("Enter the IMEI number: ");
        n = sc.nextLong();

		if (isValidIMEI(n))
			System.out.println("Valid IMEI Code");
		else
			System.out.println("Invalid IMEI Code");

	}
}

import java.util.*;
public class Q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year (e.g : 2005) : ");
        int y = sc.nextInt();
        System.out.println("Enter the month in number : ");
        int m = sc.nextInt();
        //print calendar for the month of the year
        if (m<1 || m > 12 || y < 1980) {
            System.out.println("Wrong input!");
        } else {
            printMonth(y, m);
        }
    }
    static void printMonth(int y, int m){
        printMonthTitle(y,m);
        printMonthBody(y,m);
    }
    static void printMonthTitle(int y, int m){
        System.out.println("\t"+getMonthName(m) + " " + y);
        System.out.println("-----------------------------");
        System.out.println("Sun Mon Tue Wed Thurs Fri Sat");
    }
    static String getMonthName(int m){
        //to store the name of the month
        switch (m){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Wrong input!";
        }
    }
    static void printMonthBody(int y, int m){
        int firstDay = getFirstDay(y,m);
        int nod = getNumberOfDaysInMonth(y,m);
        int i;
        for (i = 1; i <= firstDay; i++) 
            // System.out.print("    ");
        for (i = 1; i <= nod; i++) {
            if(i < 10)
            System.out.print(" " + i);
            else
            System.out.print(" " + i);

            if((i+firstDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
    static int getFirstDay(int y, int m){
        int sDay1800 = 3;
        int totalNumberOfDAys = getTotalNumberOfDays(y,m);
        return (totalNumberOfDAys + sDay1800) % 7;
    }
    static int getTotalNumberOfDays(int y, int m){
        int totalNumberOfDays = 0;
        for (int i = 1800; i < y; i++) {
            if (isLeapYear(i))
                totalNumberOfDays += 366;
            else
                totalNumberOfDays += 365;
        }
        for (int i = 1; i < m; i++) {
            totalNumberOfDays += getNumberOfDaysInMonth(y,i);
        }
        return totalNumberOfDays;
    }
    static int getNumberOfDaysInMonth(int y, int m){
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            return 31;
        if(m == 4 || m == 6 || m == 9 || m == 1)
            return 30;
        if(m == 2) 
            return isLeapYear(y) ? 29 : 28;
        return 0; //fallback if the month is incorrect   
    }
    static boolean isLeapYear(int y){
        //to determine if it is a leap year
        return y % 400 == 0 || (y%4 == 0 && y % 100 != 0);
    }
}
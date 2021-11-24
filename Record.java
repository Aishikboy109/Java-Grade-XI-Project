import java.util.*;
public class Record {
    Scanner sc = new Scanner(System.in);
    String[] name = new String[50];
    int rank[] = new int[50];

    public Record() {
        for (int i = 0; i < 50; i++) {
            name[i] = "";
            rank[i] = 0;
        }
    }
     public void readValue() {
         //prompting the user to input the values and then storing them to the respective arrays
        for (int i = 0; i < 50; i++) {
            System.out.println("Enter the name of the student");
            name[i] = sc.next();
            System.out.println("Enter the rank of the student");
            rank[i] = sc.nextInt();
        }
    }

    public void display() {
        //displaying the values of the arrays
        for (int i = 0; i < 50; i++) {
            System.out.println("Name : " + name[i] + " Rank : " + rank[i]);
        }
    }
}

class Rank extends Record {
    Scanner sc = new Scanner(System.in);
    int index;
    //Constructor to initialize the index to 0
    public Rank(){
        super();
        index = 0;
    }

    public void highest() {
        //finding the index of the topmost rank
        for (int i = 0; i < 50; i++) {
            if (rank[i] > rank[index]) {
                index = i;
            }
        }
    }

    public void display() {
        readValue();
        highest();
        super.display();
        System.out.println("The name of the student with the highest rank is " + name[index]);
    }
}
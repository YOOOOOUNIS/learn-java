package chapter3;

import java.util.Scanner;

/*
* IF ELSE
* All salespeople are expected to make at least 10 sales each week.
* For those who do, they receive a congratulatory message.
* For those who don't, they are informed of how many sales they were short.
 */
public class quotaCalculator {

    public static void main(String[] args){

        //initialize values we know
        int quota = 10 ;

        //get values we don't
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision on the path to take - output
        if (sales >= quota){
           System.out.println("congrats! You've met your quota");
        }
        else {
           int salesShort = quota - sales ;
           System.out.println("You did not make your quota. you were " + salesShort +" sales short");
        }
    }
}

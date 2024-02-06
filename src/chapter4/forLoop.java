package chapter4;

import java.util.Scanner;

/*
* For loop:
* Write a cashier program that wi;; scan a given number of items and tally the cost.
 */
public class forLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get number of items to scan
        System.out.println("Enter the number of items you would you like to scan:");
        int quantitiy = scanner.nextInt();

        double total = 0;

        //create loop to iterate through all of the items and accumulate the costs
        for (int i=0 ; i<quantitiy ; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total price is $" + total);
    }

}



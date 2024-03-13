package chapter7;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size ;
        size = scanner.nextInt();
        double[] salaries = new double[size];

        for (int i =0 ; i<salaries.length; i++){
            System.out.println("Enter salary for employee No " + (i+1));
            salaries[i] = scanner.nextDouble();
        }
        double sum=0 ;
        for (int i=0 ; i<salaries.length ; i++){
            sum+=salaries[i];
        }
        System.out.println("The sum of salaries is " + sum);
        System.out.println("The avg of salaries is " + sum/salaries.length);
    }
}

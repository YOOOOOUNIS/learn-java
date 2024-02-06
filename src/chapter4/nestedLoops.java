package chapter4;

import java.util.Scanner;

/*
* Nested Loops:
* Find the average of each student's test scores
 */
public class nestedLoops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        //Process all students
        for (int i=1; i<=numberOfStudents; i++){

            double total = 0;
            for (int j=1; j<=numberOfTests; j++){
                System.out.println("Enter the score for test #" + j);
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + i + " is =" + average);
        }

        scanner.close();
    }
}

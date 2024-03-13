package chapter6;

import java.util.Scanner;

public class FunctionRev2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,n3,total;
        double avg;
        System.out.println("enter the three numbers");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        total = sum(n1,n2,n3);
        avg = avg(n1,n2,n3);
        display(total, avg);
    }

    public static int sum(int n1, int n2, int n3){
        int result = 0;
        result = n1 + n2 + n3;
        return result;
    }

    public static double avg(int n1, int n2, int n3){
        return sum(n1,n2,n3)/3;
    }

    public static void display(int sum , double avg){
        System.out.println("The sum of numbers is " + sum);
        System.out.println("The avg of numbers is " + avg);
    }

}

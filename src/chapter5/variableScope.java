//package chapter4;
//
//import java.util.Scanner;
//
///*
//* Variable Scope
//* Write an 'instant credit check' program that approves
//* anyone who makes more than $25,000 and has a credit score
//* of 700 or better. Reject all others.
// */
//public class variableScope {
//
//    public static void main(String[] args) {
//
//        //intialize what we know
//        int requiredSalary = 2500;
//        int requiredCreditScore = 700;
//
//        //get what we don't know
//        getFormData();
//
//
//        //check if the user is qualified
//        isUserQualified();
//
//
//        //notify the user
//
//    }
//
//    public static void getFormData() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How much you make a month ?");
//        double salary = scanner.nextDouble();
//
//        System.out.println("What is your credit score ?");
//        int creditScore = scanner.nextInt();
//
//        scanner.close();
//    }
//
////    public static void isUserQualified {
////        if (creditScore >= requiredCreditScore && salary )
//    }
//}

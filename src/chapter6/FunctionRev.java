package chapter6;

import java.util.Scanner;

public class FunctionRev {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Start of the program");
//        drawLine('*' , 15);
//        System.out.println("Welcome to the first part in function");
//        drawLine('#' , 30);
        int x=50 , y=100 ;
        System.out.println(sum(x,y));
    }

    public static void drawLine(char ch , int lenth){
        for (int i = 0 ; i < lenth ; i++){
            System.out.print(ch);
        }
        System.out.println();
    }

    public static int sum (int i , int j){
        int result = 0 ;
        result = i + j ;
        return result ;
    }
}

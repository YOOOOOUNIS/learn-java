package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle Kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(Kitchen, bathroom);

        System.out.println("The total area is " + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the lenth of your room:");
        double lenth = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return  new Rectangle(lenth, width);

    }

    public double calculateTotalArea( Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}

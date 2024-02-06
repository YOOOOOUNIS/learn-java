package chapter4;

import java.util.Scanner;

/*
* Loop Break
* Search a string to detrmine if it contains the letter 'A'.
 */
public class forLoop2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get text
        System.out.println("Enter some text");
        String text = scanner.next();

        scanner.close();

        boolean letterfound = false;

        //Search text for letter 'A'
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterfound = true;
                break;
            }
        }
        if (letterfound) {
            System.out.println("This text contains the letter 'A'");
        }
    }
}

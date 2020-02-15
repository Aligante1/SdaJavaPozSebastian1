package PracaWlasna.Tablice;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a sentence(max 30 words): ");
        String userInput = scanner.nextLine();

        while (userInput.length() > 30) {
            System.out.println("Wrong!");
            userInput = scanner.nextLine();
        }
        //trim() wyrzuca biale znaki ze stringa
        char[] userInputTable = userInput.trim().toCharArray();
        char[] tempUserInputTable = userInput.trim().toCharArray();
        //Tworzy String z chara
        StringBuilder transformedUserInput = new StringBuilder();

        for (int i = 0; i < userInputTable.length; i++) {
            userInputTable[i] = tempUserInputTable[(userInputTable.length - 1) - i];
            transformedUserInput.append(userInputTable[i]);
        }

            System.out.println("Transformed string: " + transformedUserInput.toString());

        if (isPalindrome(userInput, transformedUserInput.toString())) {
            System.out.println("Your typed sentence is a palindrome!");

            if (transformedUserInput.toString().length() % 2 == 0) {
                System.out.println("Palindrome is even!");
            } else {
                System.out.println("Palindrome is odd!");
            }
        }
    }

    static boolean isPalindrome(String userInput, String transformedUserInput) {
        //sprawdza obiekty czy sa takie same
        return userInput.equals(transformedUserInput); // userInput == transformedUserInput
    }
}

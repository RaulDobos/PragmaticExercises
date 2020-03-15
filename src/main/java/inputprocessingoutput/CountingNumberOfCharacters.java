package inputprocessingoutput;

import java.util.Scanner;

public class CountingNumberOfCharacters {
    public static void main(String[] args) {

        System.out.println("What is the input string?");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input + " has " + input.length() + " characters.");
    }
}

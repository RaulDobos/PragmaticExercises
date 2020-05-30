package repetition;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandlingBadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the rate of return: ");

        String rate = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(rate);

        while(rate.equals("0") || (!matcher.find())){
            System.out.println("Your input is invalid. Try again.");
            rate = scanner.nextLine();
            matcher = pattern.matcher(rate);
        }

        System.out.println("It will take " + (72 / Double.parseDouble(rate)) + " years to double your investment.");
    }
}

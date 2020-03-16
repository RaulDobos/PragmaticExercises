package inputprocessingoutput;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age?");
        int currentAge = scanner.nextInt();

        System.out.println("At what age would you like to retire?");
        int retirementAge = scanner.nextInt();

        System.out.println("You have " + (retirementAge - currentAge) +
                        " years until you can retire.");

        System.out.println("It's " + currentYear + " so you can retire in " +
                        (currentYear + (retirementAge - currentAge)) + ".");
    }
}

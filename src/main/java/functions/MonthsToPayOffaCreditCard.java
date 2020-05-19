package functions;

import java.util.Scanner;

public class MonthsToPayOffaCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your balance?");
        double b = scanner.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        double i = scanner.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        double p = scanner.nextDouble();

        System.out.println("It will take you " + calculateMonthsUntilPaidOff(b, i, p) + " months to pay off this card.");

    }

    static double calculateMonthsUntilPaidOff(double b, double i, double p){
        i /= 36500;

        return (-1.0 / 30.0) * ((Math.log(1 + (b / p) * (1 - Math.pow((1 + i), 30)))) / (Math.log(1 + i)));


    }
}

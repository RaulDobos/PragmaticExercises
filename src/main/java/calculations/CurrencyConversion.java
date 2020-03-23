package calculations;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        double euroAmount = scanner.nextDouble();

        System.out.println("What is the exchange rate?");
        double rateFrom = scanner.nextDouble();

        final int RATE_TO = 100;

        double usdAmount = euroAmount * rateFrom / RATE_TO;

        usdAmount = roundToNextCent(usdAmount);

        System.out.println(euroAmount + " euros at an exchange rate of " + rateFrom + " is " + usdAmount + " U.S. dollars.");
    }

    static public double roundToNextCent(double amount){
        amount *= 100;
        amount = Math.floor(amount);
        amount++;
        amount /= 100;

        return amount;
    }
}

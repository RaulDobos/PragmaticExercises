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
        /**
         * Am incercat sa-mi fac o metoda care rotunjeste la urmatorul cent, cum scria in Constraints.
         * E mai complicat decat credeam si tot nu e perfect, cred ca mai bine invatam sa folosesc BigDecimal
         * cum am gasit recomandari pe net.
         */


        /**
         * Asta elimina, in cazul in care sunt, zecimalele de dupa a 3-a zecimala.
         */
        amount *= 1000;
        amount = Math.floor(amount);

        /**
         * Aici am tratat cazul in care a 3-a zecimala e diferita de 0, caz in care am rotunjit a 2-a
         * zecimala cu o unitate mai sus.
         */

        if(amount % 10 != 0) {
            amount /= 10;
            amount = Math.floor(amount);
            amount++;
            amount *= 10;
        }

        /**
         * Conversie la forma originala
         */
        amount /= 1000;

        return amount;
    }
}

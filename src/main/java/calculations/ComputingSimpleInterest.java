package calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest(percentage): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.println("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        double endInvestment = (numberOfYears * rateOfInterest/100 + 1) * principal;

        endInvestment = roundToNextCent(endInvestment);

        System.out.println("After " + numberOfYears + " years at " + rateOfInterest +
                            "%, the investment will be worth $" + endInvestment + ".");
    }

    static public double roundToNextCent(double amount){
        /**
         * Am incercat sa-mi fac o metoda care rotunjeste la urmatorul cent.
         * E mai complicat decat credeam si tot nu e perfect, cred ca mai bine invatam sa folosesc BigDecimal
         * cum am gasit recomandari pe net.
         */


        /**
         * Asta elimina, in cazul in care sunt, zecimalele de dupa a 3-a zecimala.
         */
        amount *= 1000;
        amount = Math.floor(amount);

        /**
         * Aici am tratat doar cazul in care a 3-a zecimala e diferita de 0, caz in care am rotunjit a 2-a
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

package calculations;

import java.util.Scanner;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the principal amount?");
        double principal = scanner.nextDouble();

        System.out.println("What is the rate?");
        double annualRate = scanner.nextDouble();

        System.out.println("What is the number of years?");
        int numberOfYears = scanner.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        int numberOfTimesPerYear = scanner.nextInt();

        double endInvestment = principal *
                Math.pow( ( ( (annualRate / 100) / numberOfTimesPerYear) + 1), numberOfYears * numberOfTimesPerYear);

        endInvestment = roundToNextCent(endInvestment);

        System.out.println("$" + principal + " invested  at " + annualRate + "% for " + numberOfYears +
                            " years compounded " + numberOfTimesPerYear + " times per year is $" + endInvestment + ".");

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

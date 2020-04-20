package makingdecisions;

import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BAC = 0;

        System.out.println("Enter your weight(pounds): ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter your gender(m/f): ");
        String gender = scanner.nextLine();

        while( !(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F"))){
            System.out.println("You can only enter m or f. Try again:");
            gender = scanner.nextLine();
        }

        System.out.println("Enter the number of drinks you had: ");
        int numberOfDrinks = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the amount of alcohol per drink(oz): ");
        double amountOfAlcoholPerDrink = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("How much time, in hours, has passed since your last drink: ");
        double timePassed = scanner.nextDouble();
        scanner.nextLine();

        double totalAlcoholConsumed = numberOfDrinks * amountOfAlcoholPerDrink;

        if(gender.equalsIgnoreCase("M")){
            final double alcoholDistributionRatio = 0.73;

            BAC = (totalAlcoholConsumed * 5.14 / weight * alcoholDistributionRatio) -
                            0.15 * timePassed;

            if(BAC < 0) BAC = 0;

        }
        else{
            final double alcoholDistributionRatio = 0.66;

            BAC = (totalAlcoholConsumed * 5.14 / weight * alcoholDistributionRatio) -
                    0.15 * timePassed;

            if(BAC < 0) BAC = 0;

        }

        if(BAC >= 0.08){
            System.out.println("\nYour BAC is " + BAC + ".\nIt is not legal for you to drive.");
        }
        else{
            System.out.println("\nYour BAC is " + BAC + ".\nAlthough not recommended, it is legal for you to drive.");
        }
    }
}

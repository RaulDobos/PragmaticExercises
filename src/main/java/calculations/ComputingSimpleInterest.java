package calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest(percentage): ");
        double rateOfInterest = scanner.nextDouble();
        rateOfInterest /= 100;

        System.out.println("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        double endInvestment = (numberOfYears * rateOfInterest + 1) * principal;

        System.out.println(endInvestment);
    }

    static public double roundToNextCent(double amount){
        amount *= 100;
        amount = Math.floor(amount);
        amount++;
        amount /= 100;

        return amount;
    }
}

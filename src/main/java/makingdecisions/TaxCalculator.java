package makingdecisions;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double tax = 5.5 / 100;

        System.out.println("What is the order amount?");
        double order = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What is the state?");

        String enteredState = scanner.nextLine();

        if(enteredState.equals("WI")){
            System.out.println("The subtotal is $" + order + ".");
            System.out.println("The tax is $" + order * tax + ".");
            order = order + order*tax;
        }

        System.out.println("The total is $" + order + ".");
    }
}

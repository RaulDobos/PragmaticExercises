package calculations;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        double firstItemPrice = scanner.nextDouble();
        System.out.println("Enter the quantity of item 1: ");
        int firstItemQuantity = scanner.nextInt();

        System.out.println("Enter the price of item 2: ");
        double secondItemPrice = scanner.nextDouble();
        System.out.println("Enter the quantity of item 2: ");
        int secondItemQuantity = scanner.nextInt();

        System.out.println("Enter the price of item 3: ");
        double thirdItemPrice = scanner.nextDouble();
        System.out.println("Enter the quantity of item 3: ");
        int thirdItemQuantity = scanner.nextInt();

        double subTotal = firstItemPrice * firstItemQuantity +
                            secondItemPrice * secondItemQuantity +
                            thirdItemPrice * thirdItemQuantity;

        final double TAX_RATE = 5.5 / 100;

        double tax = subTotal * TAX_RATE;

        double total = subTotal + tax;

        System.out.println("Sub total: $" + subTotal);
        System.out.println("Tax: " + tax);
        System.out.println("TOTAL: " + total);
    }
}

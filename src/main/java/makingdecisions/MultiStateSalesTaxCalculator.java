package makingdecisions;

import java.util.Scanner;

public class MultiStateSalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax = 0, total;

        System.out.println("What is the order amount?");
        double order = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What state do you live in?");
        String state = scanner.nextLine();

        if(state.equals("Wisconsin")){
            System.out.println("What county do you live in?");
            String county = scanner.nextLine();
            if(county.equals("Eau Claire")){
                tax = order * 0.05;
            }
            else if(county.equals("Dunn")){
                tax = order * 0.04;
            }
        }
        else if( state.equals("Illinois")){
            tax = order * 0.08;
        }

        total = order + tax;

        if(tax > 0){
            System.out.println("The tax is $" + tax + ".");
        }

        System.out.println("The total is $" + total + ".");

    }
}

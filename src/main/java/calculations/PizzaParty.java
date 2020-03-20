package calculations;

import java.util.Scanner;

public class PizzaParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number of people: ");
        int numberOfPeople = scanner.nextInt();

        System.out.println("Insert number of pizzas: ");
        int numberOfPizzas = scanner.nextInt();

        System.out.println("Insert number of slices for each pizza to be cut in: ");
        int numberOfSlicesPerPizza = scanner.nextInt();

        int numberOfSlicesPerPerson = numberOfPizzas * numberOfSlicesPerPizza / numberOfPeople;
        int leftovers = numberOfPizzas * numberOfSlicesPerPizza % numberOfPeople;

        System.out.println("Each person gets " + numberOfSlicesPerPerson + " slices of pizza.");
        System.out.println("There are " + leftovers + " leftover slices.");
    }
}

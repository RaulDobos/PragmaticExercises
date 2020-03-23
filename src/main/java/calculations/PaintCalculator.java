package calculations;

import java.util.Scanner;

import static java.lang.Math.*;

public class PaintCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the length of the ceiling: ");

        double length = scanner.nextDouble();

        System.out.println("Insert the width of the ceiling: ");

        double width = scanner.nextDouble();

        int areaOfCeiling = (int) Math.floor(length * width);

        final int SQUARE_FEET_PER_GALLON = 350;

        int numberOfGallonsNeeded = areaOfCeiling / SQUARE_FEET_PER_GALLON + 1;

        System.out.println("You will need to purchase " + numberOfGallonsNeeded + " gallons of paint to cover " +
                            areaOfCeiling + " square feet.");

    }
}

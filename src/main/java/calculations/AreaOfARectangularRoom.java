package calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the length of the room in feet: ");

        double roomLength = scanner.nextDouble();

        System.out.println("What is the width of the room in feet: ");

        double roomWidth = scanner.nextDouble();

        System.out.println("You entered dimensions of " + roomLength + " feet by "
                            + roomWidth + " feet.");

        double roomAreaInFeet = roomLength * roomWidth;

        final double conversionFactor = 0.09290304;

        double roomAreaInMeters = roomAreaInFeet * conversionFactor;

        System.out.println("The area is:\n" + roomAreaInFeet + " square feet \n" +
                                              roomAreaInMeters + " square meters");

        System.out.println();
    }
}

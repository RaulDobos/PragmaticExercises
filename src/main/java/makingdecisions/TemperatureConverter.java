package makingdecisions;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheitTemperature;
        double celsiusTemperature;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");

        String choice = scanner.nextLine();

        while( !((choice.equals("C") || choice.equals("c")) || (choice.equals("F") || choice.equals("f"))) ){
            System.out.println("You can only enter C or F. Please try again: ");
            choice = scanner.nextLine();
        }

        if(choice.equals("C") || choice.equals("c")){
            System.out.println("Please enter the temperature in Fahrenheit: ");
            fahrenheitTemperature = scanner.nextDouble();
            celsiusTemperature = (fahrenheitTemperature - 32) * (5 / 9);
            System.out.println("The temperature in Celsius is: " + celsiusTemperature + ".");
        }
        else if(choice.equals("F") || (choice.equals("f"))){
            System.out.println("Please enter the temperature in Celsius: ");
            celsiusTemperature = scanner.nextDouble();
            fahrenheitTemperature = (celsiusTemperature * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheitTemperature + ".");
        }
    }
}

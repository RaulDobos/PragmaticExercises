package makingdecisions;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inter your weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in inches: ");
        double height = scanner.nextDouble();

        double bmi = (weight/(height * height)) * 703;

        if(bmi < 18.5){
            System.out.println("Your bmi is " + bmi + ".");
            System.out.println("You are underweight. You should see a doctor.");
        }
        else if(bmi > 25){
            System.out.println("Your bmi is " + bmi + ".");
            System.out.println("You are over weight. You should see a doctor.");
        }
        else{
            System.out.println("Your bmi is " + bmi + ".");
            System.out.println("You are within the ideal weight range.");
        }
    }
}

package makingdecisions;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "java15";

        System.out.println("What is the password?");
        String enteredPassword = scanner.nextLine();

        if(enteredPassword.equals(correctPassword)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }

    }
}

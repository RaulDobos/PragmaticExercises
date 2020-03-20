package inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {

        //challenge #1: written without storing the input into a variable
        // i don't know if the exercise wants to avoid using the scanner variable too

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, " + scanner.nextLine() + ", nice to meet you!");

        System.out.println();

        //challenge #2

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        if(name.equals("Raul")){
            System.out.println("Hello, " + name + ", nice to meet you!");
        }
        else if(name.equals("Ovidiu")){
            System.out.println("What's up, " + name + "?");
        }
        else if(name.equals("Eduard")){
            System.out.println("Spor la corectat teme, " + name + "!");
        }
        else{
            System.out.println("Hello, " + name + ".");
        }
    }
}

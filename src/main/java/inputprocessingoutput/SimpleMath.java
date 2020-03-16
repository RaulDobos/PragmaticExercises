package inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        String input1 = scanner.nextLine();
        int a = Integer.parseInt(input1);

        System.out.println("What is the second number?");
        String input2 = scanner.nextLine();
        int b = Integer.parseInt(input2);

        System.out.println(
                a + " + " + b + " = " + (a + b) + "\n" +
                a + " - " + b + " = " + (a - b) + "\n" +
                a + " * " + b + " = " + (a * b) + "\n" +
                a + " / " + b + " = " + (float) a / b
        );
    }
}

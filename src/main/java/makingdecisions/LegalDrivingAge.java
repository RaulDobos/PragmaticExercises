package makingdecisions;

import java.util.Scanner;

public class LegalDrivingAge {
    public static void main(String[] args) {
        final int legalAge = 18;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int enteredAge = scanner.nextInt();

        System.out.println((enteredAge < legalAge) ?
                            "You are NOT old enough to legally drive" :
                            "You are old enough to legally drive.");

    }
}

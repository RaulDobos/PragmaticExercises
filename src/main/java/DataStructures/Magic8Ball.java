package DataStructures;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 3;

        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};

        System.out.println("What's your question?");
        String question = scanner.nextLine();

        System.out.println(answers[ThreadLocalRandom.current().nextInt(min, max + 1)]);

    }
}

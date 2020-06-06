package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PickingAWinner {
    public static void main(String[] args) {
        List<String> contestants = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String input = scanner.nextLine();

        while(!input.equals("")){
            contestants.add(input);
            System.out.println("Enter a name: ");
            input = scanner.nextLine();
        }

        int randomInt = ThreadLocalRandom.current().nextInt(0, contestants.size());

        System.out.println("The winner is... " +
                contestants.get(randomInt) + "!");
    }
}

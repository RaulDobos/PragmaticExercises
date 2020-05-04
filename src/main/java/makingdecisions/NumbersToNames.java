package makingdecisions;

import java.util.Scanner;

public class NumbersToNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String month = new String();

        System.out.println("What is the number of the month?");
        number = scanner.nextInt();

        switch (number){
            case 1: month = "january"; break;
            case 2: month = "february"; break;
            case 3: month = "march"; break;
            case 4: month = "april"; break;
            case 5: month = "may"; break;
            case 6: month = "june"; break;
            case 7: month = "july"; break;
            case 8: month = "august"; break;
            case 9: month = "september"; break;
            case 10: month = "october"; break;
            case 11: month = "november"; break;
            case 12: month = "december"; break;
        }

        System.out.println("The name of the month is " + month + ".");
    }
}

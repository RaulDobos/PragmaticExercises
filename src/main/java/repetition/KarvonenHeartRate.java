package repetition;

import java.util.Scanner;

public class KarvonenHeartRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ageString;
        String restingHRString;
        int targetHR;

        System.out.println("Please enter your age: ");

        ageString = scanner.nextLine();

        while(!isNumber(ageString)){
            ageString = scanner.nextLine();
        }

        System.out.println("Please enter your resting heart rate: ");

        restingHRString = scanner.nextLine();

        while(!isNumber(restingHRString)){
            restingHRString = scanner.nextLine();
        }

        int age = Integer.parseInt(ageString);
        int restingHR = Integer.parseInt(restingHRString);


        System.out.println("Intensity   | Rate");
        System.out.println("------------|---------");



        for(int intensity = 55; intensity <= 95; intensity += 5){
            targetHR = (int)Math.round((220 - age - restingHR) * ((double)intensity / 100)) + restingHR;

            System.out.println(intensity + "%         | " + targetHR + " bpm");
        }
    }

    static boolean isNumber(String s){
        try{
            int number = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("You have to enter an integer:");
            return false;
        }

        return true;
    }
}

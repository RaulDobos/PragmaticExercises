package repetition;


import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int difficulty, max, numberToGuess, numberOfGuesses;
        final int min = 1;
        String playAgainPrompt = "";
        String userGuess;

        do {
            numberOfGuesses = 0;

            System.out.println("Let's play Guess The Number.");
            System.out.println("Pick a difficulty level (1, 2 or 3): ");

            difficulty = scanner.nextInt();
            scanner.nextLine();

            while (difficulty < 1 || difficulty > 3) {
                System.out.println("You can only pick 1, 2 or 3. Try again: ");
                difficulty = scanner.nextInt();
                scanner.nextLine();
            }

            if(difficulty == 1){
                max = 10;
            }
            else if(difficulty == 2){
                max = 100;
            }
            else{
                max = 1000;
            }

            numberToGuess = (int)(Math.random() * (max - min + 1) + min);

            System.out.println("I have my number, what's your guess? " + " (" + numberToGuess + ")");

            do {
                userGuess = scanner.nextLine();

                while(!isNumber(userGuess)){
                    numberOfGuesses++;
                    userGuess = scanner.nextLine();
                }

                if(Integer.parseInt(userGuess) < numberToGuess){
                    System.out.println("Too low. Guess again: ");
                }
                else if(Integer.parseInt(userGuess) > numberToGuess){
                    System.out.println("Too high. Guess again: ");
                }

                numberOfGuesses++;
            }
            while(numberToGuess != Integer.parseInt(userGuess));

            System.out.println("You got it in " + numberOfGuesses + "!");


            System.out.println("Do you want to play again? (y/n)");
            playAgainPrompt = scanner.nextLine();
        }while(playAgainPrompt.equals("y"));

    }

    static boolean isNumber(String s){
        try{
            Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("You have to enter an integer: ");
            return false;
        }

        return true;
    }
}

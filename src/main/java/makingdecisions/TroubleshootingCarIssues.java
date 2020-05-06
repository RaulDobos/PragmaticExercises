package makingdecisions;

import java.util.Scanner;

public class TroubleshootingCarIssues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Is the car silent when you turn the key?");

        input = scanner.nextLine();

        if(input.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            input = scanner.nextLine();
            if(input.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else if(input.equals("n")){
                System.out.println("Replace cables and try again.");
            }
            else{
                System.out.println("You can only enter y/n.");
                System.exit(-1);
            }
        }
        else if(input.equals("n")){
            System.out.println("Does the care make a clicking noise?");

            input = scanner.nextLine();

            if(input.equals("y")){
                System.out.println("Replace the battery.");
            }
            else if(input.equals("n")){
                System.out.println("Does the car crank up but fail to start?");

                input = scanner.nextLine();

                if(input.equals("y")){
                    System.out.println("Check spark plug connections.");
                }
                else if(input.equals("n")){
                    System.out.println("Does the engine start and then die?");

                    input = scanner.nextLine();

                    if(input.equals("y")){
                        System.out.println("Does your car have fuel injection?");

                        input = scanner.nextLine();

                        if(input.equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else if(input.equals("n")){
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                        else{
                            System.out.println("You can only enter y/n.");
                            System.exit(-1);
                        }
                    }
                    else{
                        System.out.println("You can only enter y.");
                        System.exit(-1);
                    }
                }
                else{
                    System.out.println("You can only enter y/n.");
                    System.exit(-1);
                }
            }
            else{
                System.out.println("You can only enter y/n.");
                System.exit(-1);
            }
        }
        else{
            System.out.println("You can only enter y/n.");
            System.exit(-1);
        }
    }
}

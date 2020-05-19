package functions;

import java.util.Scanner;

public class ValidatingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter the ZIP code: ");
        String zipCode= scanner.nextLine();

        System.out.println("Enter an employee ID: ");
        String id = scanner.nextLine();

        if(validateInput(firstName, lastName, zipCode, id)){
            System.out.println("There were no errors found.");
        }
    }

    static boolean validateInput(String firstName, String lastName, String zipCode, String id){
        boolean valid = true;

        if(validateName(firstName) == -1){
            System.out.println("\"" + firstName + "\" is not a valid first name. It is too short.");
            valid = false;
        }

        if(validateName(firstName) == 0){
            System.out.println("The first name must be filled in.");
            valid = false;

        }

        if(validateName(lastName) == -1){
            System.out.println("\"" + lastName + "\" is not a valid first name. It is too short.");
            valid = false;

        }

        if(validateName(lastName) == 0){
            System.out.println("The last name must be filled in.");
            valid = false;

        }

        if(validateZipCode(zipCode) == 0){
            System.out.println("The ZIP code must be numeric.");
            valid = false;

        }

        if(validateId(id) == 0){
            System.out.println(id + " is not a valid ID.");
            valid = false;
        }

        return valid;

    }

    static int validateName(String s){

        /**
         *
         * returns -1 if the string is too short
         * returns 0 if the string is not filled in
         * returns 1 if no errors are found
         */

        if(s.equals("")){
            return 0;
        }

        if(s.length() < 2){
            return -1;
        }

        return 1;
    }

    static int validateZipCode(String zipCode){
        try{
            int zipToNumber = Integer.parseInt(zipCode);
        }
        catch(NumberFormatException nfe){
            return 0;
        }

        return 1;
    }

    static int validateId(String id){
        int valid = 1;
        int i;

        if(id.length() != 7){
            valid = 0;
            return valid;
        }

        for(i = 0; i < 2; i++){
            if(!Character.isLetter(id.charAt(i))){
                valid = 0;
            }
        }

        if(!(id.charAt(2) == '-')){
            valid = 0;
        }

        for(i = 3; i <= 6; i++){
            if(!(Character.isDigit(id.charAt(i)))){
                valid = 0;
            }
        }

        return valid;
    }
}





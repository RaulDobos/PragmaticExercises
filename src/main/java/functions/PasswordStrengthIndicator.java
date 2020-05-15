package functions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your passsword: ");
        String password = scanner.nextLine();

        switch(passwordValidator(password)){
            case 0: System.out.println("The password " + password + " is a very weak password."); break;
            case 1: System.out.println("The password " + password + " is a weak password."); break;
            case 2: System.out.println("The password " + password + " is a strong password.");break;
            case 3: System.out.println("The password " + password + " is a very strong password."); break;
        }
    }

    static int passwordValidator(String password){
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        boolean foundSpecial = m.find();

        p = Pattern.compile("[a-z ]", Pattern.CASE_INSENSITIVE);
        m = p.matcher(password);
        boolean foundLetter = m.find();

        p = Pattern.compile("[0-9 ]");
        m = p.matcher(password);
        boolean foundNumber = m.find();

        if(password.length() > 8){
            if(foundSpecial && foundLetter && foundNumber){
                return 3;
            }
            else if(foundLetter && foundNumber){
                return 2;
            }
        }
        else{
            if(foundLetter && !foundNumber && !foundSpecial){
                return 1;
            }
            else if(foundNumber && !foundLetter && !foundSpecial){
                return 0;
            }
        }

        return -1;
    }
}

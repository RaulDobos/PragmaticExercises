package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeListRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] employees = {"John Smith",
                            "Jackie Jackson",
                            "Chris Jones",
                            "Amanda Cullen",
                            "Jeremy Goodwin"};

        System.out.println("There are " + employees.length + " employees:");

        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }

        System.out.println("\nEnter an employee name to remove: ");
        String choice = scanner.nextLine();

        for(int i = 0; i < employees.length; i++){
            if(employees[i].equals(choice)){
                for(int j = i; j < employees.length - 1; j++){
                    employees[j] = employees[j + 1];
                }
                employees[employees.length - 1] = "";
                break;
            }
        }

        System.out.println("There are " + (employees.length - 1) + " employees: ");

        for(int i = 0; i < employees.length - 1; i++){
            System.out.println(employees[i]);
        }

    }
}

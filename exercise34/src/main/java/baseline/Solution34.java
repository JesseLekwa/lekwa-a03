package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // use an array to store in the existing employees
        ArrayList<String> employees = new ArrayList<String>
                (Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

        // print out original list of 5 people
        System.out.println("" + employees);

        // read in name to remove from list
        System.out.println("Enter an employee name to remove: ");
        String removeEmployee = sc.nextLine();

        // read in the name through the array to remove it from the array
        employees.remove(removeEmployee);

        // print out new list of employees with removed name
        System.out.println("");

    }

    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are " + employees.size() + " employees: ");
        for (String emp : employees) {
            System.out.println(emp);
        }
    }
}
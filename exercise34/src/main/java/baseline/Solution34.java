package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        ArrayList<String> employees = new ArrayList<String>//for storing employee names
                (Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));


        System.out.println("" + employees);// print list of employees


        System.out.println("Enter an employee name to remove: ");
        String removeEmployee = sc.nextLine();


        employees.remove(removeEmployee);


        System.out.println("");// print new list of employees

    }

    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are " + employees.size() + " employees: ");
        for (String emp : employees) {
            System.out.println(emp);
        }
    }
}
package salarycalculation.application;

import salarycalculation.entities.Calculation;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        calculation.name = sc.nextLine();
        System.out.println("Enter gross salary: ");
        calculation.grossSalary = sc.nextDouble();
        System.out.println("Enter tax: ");
        calculation.tax = sc.nextDouble();

        System.out.println("Employee: " + calculation.name + " $" + calculation.netSalary());

        System.out.println("Which percentage to increase salary?");
        calculation.promotion = sc.nextDouble();

        System.out.println("Updated data: " + calculation.name + ", $" + calculation.netSalaryWithPromotion());
    }
}

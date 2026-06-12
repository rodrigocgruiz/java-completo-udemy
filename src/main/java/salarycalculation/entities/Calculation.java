package salarycalculation.entities;

public class Calculation {
    public String name;
    public double grossSalary;
    public double tax;
    public double promotion;

    public double netSalary() {
        return grossSalary - tax;
    }

    public double netSalaryWithPromotion() {
        return grossSalary + (promotion / 100 * grossSalary);
    }

}

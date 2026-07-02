package circlecalculator.application;

import circlecalculator.util.Calculator;

import java.util.Scanner;

public class ProgramVersionTwo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference:  %.2f%n", c ) ;
        System.out.printf("Volume:  %.2f%n", v ) ;
        System.out.printf("PI value :  %.2f%n", calc.PI) ;

        sc.close();
    }

}

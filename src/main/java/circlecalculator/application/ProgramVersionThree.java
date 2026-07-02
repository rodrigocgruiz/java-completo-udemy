package circlecalculator.application;

import circlecalculator.util.CalculatorTwo;

import java.util.Scanner;

public class ProgramVersionThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double c = CalculatorTwo.circumference(radius);
        double v = CalculatorTwo.volume(radius);

        System.out.printf("Circumference:  %.2f%n", c ) ;
        System.out.printf("Volume:  %.2f%n", v ) ;
        System.out.printf("PI value :  %.2f%n", CalculatorTwo.PI) ;

        sc.close();
    }
}

package arearectangleapplication.application;

import arearectangleapplication.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        rectangle.width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        rectangle.height = scanner.nextDouble();

        System.out.printf("\nArea = %.2f", rectangle.area());
        System.out.printf("\nPerimeter = %.2f",  rectangle.perimeter());
        System.out.printf("\nDiagonal = %.2f",  rectangle.diagonal());

    }
}

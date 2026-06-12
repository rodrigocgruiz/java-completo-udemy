package triangleareaapplication.application;

import triangleareaapplication.entities.Triangle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AreaDoTriangulo {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Locale localAtual = Locale.getDefault();

        ResourceBundle bundle = ResourceBundle.getBundle("Mensagens", localAtual);

        Scanner scanner = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println(bundle.getString("msg_triangulo_x"));
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println(bundle.getString("msg_triangulo_y"));
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        boolean xValido = (x.a + x.b > x.c) && (x.a + x.c > x.b) && (x.b + x.c > x.a);
        boolean yValido = (y.a + y.b > y.c) && (y.a + y.c > y.b) && (y.b + y.c > y.a);

        if(!xValido || !yValido){
            System.out.println(bundle.getString("erro_invalido"));
            return;
        }

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf(localAtual, bundle.getString("resultado_x"), areaX);
        System.out.printf(localAtual, bundle.getString("resultado_y"), areaY);

        if(areaX > areaY){
            System.out.println(bundle.getString("x_maior"));
        } else if (areaX < areaY) {
            System.out.println(bundle.getString("y_maior"));
        } else {
            System.out.println(bundle.getString("areas_iguais"));
        }
    }
}
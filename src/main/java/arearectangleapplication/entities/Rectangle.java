package arearectangleapplication.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }
}

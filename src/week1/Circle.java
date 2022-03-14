package week1;

public class Circle extends Shape{

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

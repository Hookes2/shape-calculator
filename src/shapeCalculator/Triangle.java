package shapeCalculator;

public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base  = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        double area = 0.5 * base * height;
        return area;
    }
}

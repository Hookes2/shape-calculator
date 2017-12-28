package shapeCalculator;

public class Circle extends shapeCalculator.Shape {
double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

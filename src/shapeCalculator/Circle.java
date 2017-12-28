package shapeCalculator;

public class Circle extends shapeCalculator.Shape {

    public double calculateArea(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

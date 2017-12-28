
package shapeCalculator;

public class Calculator {
    public static void main(String [] args)
    {
     Shape circle = new Circle(12);
     circle.showResult("circle",  circle.calculateArea());

     Shape triangle = new Triangle(10, 12);
     triangle.showResult("triangle",  triangle.calculateArea());


    }

}

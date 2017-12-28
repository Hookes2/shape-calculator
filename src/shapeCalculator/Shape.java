package shapeCalculator;

public abstract class Shape {

    public void showResult(String shape, double area)
    {
        if (shape.toLowerCase() == "circle")
        System.out.println("The area of the "+shape + " is: "+area+ " square metres");
        else
            System.out.println("The area of the "+shape + " is: "+area+ " metres");

    }

    public abstract double calculateArea();
}

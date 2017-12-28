
package shapeCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args)
    {
        System.out.println("Enter the shape:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.toLowerCase() == "circle")
        {
            System.out.println("Enter the radius:");
            String radius = scanner.next();
            shapeCalculator.Circle circle = new shapeCalculator.Circle();
            circle.showResult(input, circle.calculateArea(Double.parseDouble(radius)));
        }
        else if(input.toLowerCase()=="triangle")
        {
        System.out.println("Enter the base:");
        String base = scanner.next();
        System.out.println("Enter the height:");
        String height = scanner.next();
        Triangle triangle = new Triangle();
        triangle.showResult(input, triangle.calculateArea(Double.parseDouble(base), Double.parseDouble(height)));
        }

        else
        {
            System.out.println("Shape unknown...");
        }


    }
}

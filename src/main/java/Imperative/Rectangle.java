package Imperative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    double width, height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() throws IOException {
        System.out.println("width = ");
         width = Double.parseDouble(bufferedReader.readLine());
        System.out.println("height = ");
         height = Double.parseDouble(bufferedReader.readLine());
    }

    public double CountRectangleArea(Rectangle rectangle) {

        return rectangle.width * rectangle.height;
    }

    public double CountPerimeterOfThisRectangle (Rectangle rectangle) {

      return (rectangle.width+ rectangle.height) * 2;
    }



    public static void main(String[] args) throws IOException {
        Rectangle newRectangle1 = new Rectangle();
        System.out.println("rectangle area = " + newRectangle1.CountRectangleArea(newRectangle1));
        System.out.println("perimeter of rectangle = " + newRectangle1.CountPerimeterOfThisRectangle(newRectangle1));
        System.out.println("------------------------------");
        Rectangle newRectangle2 = new Rectangle(5,6);
        System.out.println("width = " + newRectangle2.width);
        System.out.println("height = " + newRectangle2.height);
        System.out.println("rectangle area = " + newRectangle2.CountRectangleArea(newRectangle2));
        System.out.println("perimeter of rectangle = " + newRectangle2.CountPerimeterOfThisRectangle(newRectangle2));
    }
}

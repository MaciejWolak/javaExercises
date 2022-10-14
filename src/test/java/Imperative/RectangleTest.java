package Imperative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest{


    Rectangle rectangle = new Rectangle(2,5);

@Test
public void testRectangleArea(){

    Assertions.assertEquals(10, rectangle.CountRectangleArea(rectangle));
}

@Test
    public void testPerimeterOfRectangle() {
    Assertions.assertEquals(14, rectangle.CountPerimeterOfThisRectangle(rectangle));
}
}
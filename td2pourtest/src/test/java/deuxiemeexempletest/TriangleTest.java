package deuxiemeexempletest;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
	@Test
    public void testInvalidTriangle() {
        double a = 2;
        double b = 3;
        double c = 6;
        int expectedOutput = 0;
        int actualOutput = deuxiemeexemple.TriangleManager.triangle(a, b, c);
        assertEquals(expectedOutput, actualOutput);
    }    
    @Test
    public void testEquilateralTriangle() {
        double a = 5;
        double b = 5;
        double c = 5;
        int expectedOutput = 1;
        int actualOutput = deuxiemeexemple.TriangleManager.triangle(a, b, c);
        assertEquals(expectedOutput, actualOutput);
    } 
    @Test
    public void testIsoscelesTriangle() {
        double a = 7;
        double b = 7;
        double c = 10;
        int expectedOutput = 2;
        int actualOutput = deuxiemeexemple.TriangleManager.triangle(a, b, c);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testValidTriangle() {
        double a = 3;
        double b = 4;
        double c = 5;
        int expectedOutput = 3;
        int actualOutput = deuxiemeexemple.TriangleManager.triangle(a, b, c);
        assertEquals(expectedOutput, actualOutput);    }

}

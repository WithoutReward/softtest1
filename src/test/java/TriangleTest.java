import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TriangleTest {


    @Test
    @DisplayName("一般三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("一般三角形", type);
    }

    @Test
    @DisplayName("等边三角形")
    public void testEquilateralTriangle() {
        Triangle t = new Triangle();
        String result = t.classify(3, 3, 3);
        assertEquals("等边三角形", result);
    }

    @Test
    @DisplayName("等腰三角形")
    public void testIsoscelesTriangle() {
        Triangle t = new Triangle();
        String result = t.classify(5, 5, 7);
        assertEquals("等腰三角形", result);
    }

    @Test
    @DisplayName("一般三角形")
    public void testScaleneTriangle() {
        Triangle t = new Triangle();
        String result = t.classify(3, 4, 5);
        assertEquals("一般三角形", result);
    }

    @Test
    @DisplayName("输入错误")
    public void testInvalidInput() {
        Triangle t = new Triangle();
        String result = t.classify(-1, 2, 3);
        assertEquals("输入错误", result);
    }

    @Test
    @DisplayName("非三角形")
    public void testNotATriangle() {
        Triangle t = new Triangle();
        String result = t.classify(1, 2, 3);
        assertEquals("非三角形", result);
    }

}

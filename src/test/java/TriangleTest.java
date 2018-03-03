import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void equilateral() {
        Triangle tg = new Triangle();
        assertEquals(true,tg.equilateral(10,10,10));
    }

    @Test
    void isosceles() {
        Triangle tg = new Triangle();
        assertEquals(true,tg.isosceles(10,10,5));
    }

    @Test
    void scalene() {
        Triangle tg = new Triangle();
        assertEquals(true,tg.scalene(10,20,15));
    }
}
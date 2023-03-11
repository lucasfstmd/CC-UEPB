package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    }

    @Test
    void testTrianguloIsosceles() throws TriangleException {
        Triangle triangulo = new Triangle(5, 5, 6);
        assertEquals(TriangleKind.ISOSCELES, triangulo.getKind());
    }

    @Test
    void testTrianguloEscaleno() throws TriangleException {
        Triangle triangulo = new Triangle(3, 4, 5);
        assertEquals(TriangleKind.SCALENE, triangulo.getKind());
    }

    @Test
    void testLadoNegativo() {
        assertThrows(TriangleException.class, () -> new Triangle(-1, 2, 3));
    }

    @Test
    void testLadoInpossivel() {
        assertThrows(TriangleException.class, () -> new Triangle(1, 2, 10));
    }

    @Test
    void testTodosOsLadosZero() {
        assertThrows(TriangleException.class, () -> new Triangle(0, 0, 0));
    }

    @Test
    void testNumeroDeLadosUnicos() throws TriangleException {
        Triangle triangulo = new Triangle(3, 4, 5);
        assertEquals(3, triangulo.getNumberOfUniqueSides());

        triangulo = new Triangle(3, 3, 5);
        assertEquals(2, triangulo.getNumberOfUniqueSides());

        triangulo = new Triangle(2, 2, 2);
        assertEquals(1, triangulo.getNumberOfUniqueSides());
    }
}
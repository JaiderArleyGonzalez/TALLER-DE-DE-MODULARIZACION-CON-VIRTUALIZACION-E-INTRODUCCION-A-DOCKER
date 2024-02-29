package co.edu.escuelaing.sparkdockerdemolive;
import junit.framework.TestCase;

public class OperacionesTest extends TestCase {

    public void testSin() {
        assertEquals(0.0, Operaciones.sin("0"), 0.001);
        assertEquals(1.0, Operaciones.sin("90"), 0.001);
        assertEquals(0.0, Operaciones.sin("180"), 0.001);
    }

    public void testCos() {
        assertEquals(1.0, Operaciones.cos("0"), 0.001);
        assertEquals(0.0, Operaciones.cos("90"), 0.001);
        assertEquals(-1.0, Operaciones.cos("180"), 0.001);
    }

    public void testEsPalindromo() {
        assertTrue(Operaciones.esPalindromo("reconocer"));
        assertTrue(Operaciones.esPalindromo("Anita lava la tina"));
        assertFalse(Operaciones.esPalindromo("hola"));
    }

    public void testMagnitudVector() {
        assertEquals(5.0, Operaciones.magnitudVector("3", "4"), 0.001);
        assertEquals(13.0, Operaciones.magnitudVector("5", "12"), 0.001);
    }
}
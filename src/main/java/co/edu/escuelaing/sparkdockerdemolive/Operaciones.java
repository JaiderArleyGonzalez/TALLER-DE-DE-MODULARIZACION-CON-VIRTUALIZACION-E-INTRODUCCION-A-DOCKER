package co.edu.escuelaing.sparkdockerdemolive;

import static java.lang.Math.*;

public class Operaciones {
    public static double sin(String angulo) {
        double anguloEnRadianes = toRadians(Double.parseDouble(angulo));
        return Math.sin(anguloEnRadianes);
    }

    public static double cos(String angulo) {
        double anguloEnRadianes = toRadians(Double.parseDouble(angulo));
        return Math.cos(anguloEnRadianes);
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
        int longitud = cadenaSinEspacios.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadenaSinEspacios.charAt(i) != cadenaSinEspacios.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static double magnitudVector(String x, String y) {
        double x1 = Double.parseDouble(x);
        double y1 = Double.parseDouble(y);
        return sqrt(x1 * x1 + y1 * y1);
    }

}

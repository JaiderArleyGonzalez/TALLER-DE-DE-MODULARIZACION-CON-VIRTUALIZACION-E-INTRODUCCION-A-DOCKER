package co.edu.escuelaing.sparkdockerdemolive;

import com.sun.net.httpserver.HttpServer;

import java.io.*;

import java.net.*;
import java.nio.file.*;

import static spark.Spark.*;

public class SparkWebServer {


    public static void main(String... args) throws URISyntaxException, IOException {

        port(getPort());
        staticFiles.location("/public");
        get("hello", (req,res) -> "Hello Docker!");
        get("/sin/:angulo", (req, res) -> {
            String angulo = req.params(":angulo");
            return "El seno de " + angulo + " es: " + Operaciones.sin(angulo);
        });

        get("/cos/:angulo", (req, res) -> {
            String angulo = req.params(":angulo");
            return "El coseno de " + angulo + " es: " + Operaciones.cos(angulo);
        });

        get("/esPalindromo/:cadena", (req, res) -> {
            String cadena = req.params(":cadena");
            return "¿Es '" + cadena + "' un palíndromo?: " + Operaciones.esPalindromo(cadena);
        });

        get("/magnitudVector/:x/:y", (req, res) -> {
            String x = req.params(":x");
            String y = req.params(":y");
            return "La magnitud del vector (" + x + ", " + y + ") es: " + Operaciones.magnitudVector(x, y);
        });

    }


    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
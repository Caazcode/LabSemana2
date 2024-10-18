
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrianaguilar
 */
public class Ejercicio4_Formulas {
    
    public static void main(String[] args) {
        
        Scanner math = new Scanner(System.in);

        System.out.println("Problema matematico a:");
        double resultadoA = (3.0 / 2) + (4.0 / 3);
        System.out.println("El resultado de (3/2) + (4/3) es: " + resultadoA);

        System.out.println("\nProblema matematico b:");
        System.out.print("Ingresa el valor de x: ");
        double x = math.nextDouble();
        System.out.print("Ingresa el valor de y: ");
        double y = math.nextDouble();
        double resultadoB = (1 / (x - 5)) - (3 * x * y / 4);
        System.out.println("El resultado de (1/(x - 5)) - (3xy/4) es: " + resultadoB);

        System.out.println("\nProblema matematico:");
        double resultadoC = (1.0 / 2) + 7;
        System.out.println("El resultado de (1/2) + 7 es: " + resultadoC);

        System.out.println("\nProblema matematico:");
        double resultadoD = 7 + (1.0 / 2);
        System.out.println("El resultado de 7 + (1/2) es: " + resultadoD);

        System.out.println("\nProblema matematico:");
        System.out.print("Ingresa el valor de a: ");
        double a = math.nextDouble();
        System.out.print("Ingresa el valor de b: ");
        double b = math.nextDouble();
        System.out.print("Ingresa el valor de c: ");
        double c = math.nextDouble();
        System.out.print("Ingresa el valor de d: ");
        double d = math.nextDouble();
        System.out.print("Ingresa el valor de e: ");
        double e = math.nextDouble();
        System.out.print("Ingresa el valor de f: ");
        double f = math.nextDouble();
        System.out.print("Ingresa el valor de g: ");
        double g = math.nextDouble();
        System.out.print("Ingresa el valor de h: ");
        double h = math.nextDouble();
        System.out.print("Ingresa el valor de j: ");
        double j = math.nextDouble();

        double aCuadrado = a * a;
        double resultadoE = (aCuadrado / (b - c)) + ((d - e) / (f - (g * h / j)));
        System.out.println("El resultado de (a^2)/(b-c) + (d-e)/(f-g*h/j) es: " + resultadoE);

        
        System.out.println("\nProblema matematico:");
        System.out.print("Ingresa el valor de m: ");
        double m = math.nextDouble();
        System.out.print("Ingresa el valor de n: ");
        double n = math.nextDouble();
        System.out.print("Ingresa el valor de p: ");
        double p = math.nextDouble();
        double resultadoF = (m / n) + p;
        System.out.println("El resultado de (m/n) + p es: " + resultadoF);


        System.out.println("\nProblema matematico:");
        System.out.print("Ingresa el valor de p: ");
        double q = math.nextDouble();
        double resultadoG = (m + n) / (p - q);
        System.out.println("El resultado de (m + n)/(p - q) es: " + resultadoG);


        System.out.println("\nProblema matematico:");

        double bCuadrado = b * b;
        double cCuadrado = c * c;
        double dCuadrado = d * d;
        double resultadoH = (aCuadrado / bCuadrado) + (cCuadrado / dCuadrado);
        System.out.println("El resultado de (a^2/b^2) + (c^2/d^2) es: " + resultadoH);


        System.out.println("\nProblema matematico:");
        System.out.print("Ingresa el valor de q: ");
        double q2 = math.nextDouble();
        System.out.print("Ingresa el valor de r: ");
        double r = math.nextDouble();
        System.out.print("Ingresa el valor de s: ");
        double s = math.nextDouble();
        double resultadoI = (m + (n / p)) / (q2 - (r / s));
        System.out.println("El resultado de (m + (n/p))/(q - (r/s)) es: " + resultadoI);


        System.out.println("\nProblema matematico:");
        System.out.print("Ingresa el valor de e: ");
        double e2 = math.nextDouble();
        double resultadoJ = ((3 * a + b) / (c - (d + 5 * e2))) / ((f + g) / (2 * h));
        System.out.println("El resultado de ((3a + b)/(c - (d + 5e)))/((f + g)/(2h)) es: " + resultadoJ);


        System.out.println("\nProblema matematico:");

        double resultadoK = (aCuadrado + 2 * a * b + b * b) / (1 / (x * x + 2));
        System.out.println("El resultado de (a^2 + 2ab + b^2)/(1/(x^2 + 2)) es: " + resultadoK);

       
    }
}

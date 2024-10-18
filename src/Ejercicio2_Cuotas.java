
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrianaguilar
 */
public class Ejercicio2_Cuotas {
    
    public static void main(String[] args) {
        double prestamo,interesMensual,comisionCuota,porcentajeSeguro,interesSimple,totalPrestamoConInteres,cuotaMensual,totalAPagar;
        int meses;
        Scanner info = new Scanner(System.in);
        
        System.out.println("Ingrese el monto del préstamo: ");
        prestamo = info.nextDouble();
        
        System.out.println("Ingrese la tasa de interés mensual: ");
        interesMensual = info.nextDouble() / 100;
        
        System.out.println("Ingrese el plazo de pago en meses: ");
        meses = info.nextInt();
        
        System.out.println("Ingrese la comisión por cuota: ");
        comisionCuota = info.nextDouble();
        
        System.out.println("Ingrese el porcentaje de seguro mensual: ");
        porcentajeSeguro = info.nextDouble() / 100;
        
    
        interesSimple = prestamo * interesMensual * meses;
        
        totalPrestamoConInteres = prestamo + interesSimple;
        
        cuotaMensual = (totalPrestamoConInteres + comisionCuota) * (1 + porcentajeSeguro) / meses;
        
        totalAPagar = cuotaMensual * meses;
        
        System.out.println("\n******* CUOTAS MENSUALES *******");
        System.out.printf("Cuota de Pago Mensual: Lps. %.2f\n", cuotaMensual);
        System.out.printf("Total a Pagar: Lps. %.2f\n", totalAPagar);

                
        } 
}

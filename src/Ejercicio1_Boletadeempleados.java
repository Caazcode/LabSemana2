
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrianaguilar
 */
public class Ejercicio1_Boletadeempleados {


    public static void main(String[] args) {
    
        String nombreEmpleado;
        double horasmensuales;
        double tarifasHoras;
        double salariosemanal;
        Scanner info = new Scanner(System.in);
        
        System.out.println("----- Boleta del Empleado -------");
        
        System.out.println("Ingrese nombre del empleado:");       
        nombreEmpleado=info.next();
        
        System.out.println("Ingrese horas trabajadas:");        
        horasmensuales=info.nextInt();
        
        System.out.println("Ingrese la tarifa de las horas:");        
        tarifasHoras=info.nextDouble();
        
       salariosemanal = (horasmensuales / 4) * tarifasHoras;
       
       
        System.out.println("\n------- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Hora de Trabajo Mensual: " + horasmensuales + " horas");
        System.out.println("Tarifa por Hora: Lps. " + String.format("%.2f", horasmensuales));
        System.out.println("Salario del Empleado Semanal: Lps. " + String.format("%.2f", salariosemanal));
        
        
    }
}

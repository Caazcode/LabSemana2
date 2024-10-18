
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Ejercicio3_Clicks {
       public static void main(String[] args) {
        

        double totalprecio,totalclicks,isv,isv2;
        Scanner info = new Scanner(System.in);
        
        System.out.println("Ingrese los primeros clicks: ");
        int clicks1 = info.nextInt();
        System.out.println("Ingrese el precio de los primeros clicks");
        double precio1 = info.nextDouble();
        
        System.out.println("Ingrese los segundos clicks: ");
        int clicks2 = info.nextInt();
        System.out.println("Ingrese el precio de los segundos clicks: ");
        double precio2 = info.nextDouble();
        
        System.out.println("Ingrese la cantidad de los terceros clicks: ");
        int clicks3 = info.nextInt();
        System.out.println("Ingrese el precio de los terceros clicks: ");
        double precio3 = info.nextDouble();
               
        totalprecio= precio1 + precio2 + precio3; 
        totalclicks = (clicks1*precio1)+(clicks2*precio2)+(precio3*clicks3);
        double promedio = totalclicks/totalprecio ;
        isv = totalclicks*0.16;
        isv2 = totalclicks + isv;
        
        System.out.println("Precio promedio de clicks: " + String.format(" %.2f", promedio));
        System.out.println("ISV Total: " + String.format( "%.2f", isv));
        System.out.println("Total con ISV: Lps. " + String.format("%.2f", isv2));

    }
    
}

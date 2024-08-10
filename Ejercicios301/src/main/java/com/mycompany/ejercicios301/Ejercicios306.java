package com.mycompany.ejercicios301;

import java.util.Scanner;

public class Ejercicios306 {
     public static void main(String[] args) {
        
         Scanner lector = new Scanner(System.in);
         
         System.out.println("Escriba un programa que permita ingresar el dato anio y devuelva, si es bisiesto o\n" +
"no");
         
         System.out.print("Ingresa el anio XXXX: ");
         int y= lector.nextInt();
         
         if ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0)) {
             System.out.println("El anio " + y + " es bisiesto");
         } else 
            System.out.println("El anio " + y + " no es bisiesto");
    }
}

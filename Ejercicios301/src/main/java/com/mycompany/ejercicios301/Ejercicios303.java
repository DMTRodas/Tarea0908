
package com.mycompany.ejercicios301;
import java.util.Scanner;

public class Ejercicios303 {
    public static void main(String[] args) {
        
        Scanner lector= new Scanner(System.in);
        
        System.out.println("Escribir un programa que permita ingresar la edad del usuario y muestre en pantalla si es mayor o menor de edad");
        
        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();
        
        if (edad>=18){
            System.out.println("El usuario es mayor de edad");
        }else
            System.out.println("El usuario es menor de edad");
    }   
}

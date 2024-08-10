
package com.mycompany.ejercicios301;
import java.util.Scanner;

public class Ejercicios304 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escribir un programa que permite ingresar un numero entero y deevuelva si es positivo o negativo");
        
        System.out.print("Ingrese un numero: ");
        int n= lector.nextInt();
        
        if (n==0){
            System.out.println("El numero es neutro");
        }else if (n<0){
            System.out.println("El numero "+n+" es negativo");
        }else 
            System.out.println("El numero "+n+" es positivo");
    }
}

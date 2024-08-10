
package com.mycompany.ejercicios301;
import java.util.Scanner;

public class Ejercicios302 {
    public static void main(String[] args) {
        
        Scanner lector= new Scanner (System.in);
        
        System.out.println("Escribir un programa que permita ingresar 3 nueros enteros, los compare y devuelva el mayor");
        
        //Declaracion e ingreso de variables
        
        System.out.print("Ingrese el primer valor: ");
        int n1=lector.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        int n2= lector.nextInt();
        
        System.out.print("Ingrese el tercerr valor ");
        int n3=lector.nextInt();
        
        if (n1>n2){
            if (n1>n3){
                System.out.println("El mayor es "+n1);
            }else {
                System.out.println("El mayor es "+n3);
            }
        } else if (n2>n3){
            System.out.println("El mayor es: "+n2);
        }else{
            System.out.println("El mayor es: "+n3);
        }
        
    }
    
}

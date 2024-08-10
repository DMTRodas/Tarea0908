

package com.mycompany.ejercicios301;
import java.util.Scanner;

public class Ejercicios301 {

    public static void main(String[] args) {
        
        Scanner lector =new Scanner (System.in);
        System.out.println("Escribir un programa que permita ingresar 2 numeros enteros, los compara y devuelva el mayor");
        
        System.out.print("Ingrese el primer valor ");
        int n1=lector.nextInt();
        
        System.out.print("Ingrese el segundo valor: ");
        int n2= lector.nextInt();
        
        if (n1==n2)
            System.out.println("Numeros iguales");
        else{
            if (n1>n2)
                System.out.println(n1+" es mayor que "+n2);
            else
                System.out.println(n2+" es mayor que "+n1);
        }
    }
    
}

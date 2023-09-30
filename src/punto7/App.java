package punto7;

import java.util.Scanner;

// Elaborar Un algoritmo que le permita al usuario leer 3
// número diferentes entre sí y el computador le imprima el
// mayor de ellos.

public class App {

static Scanner leer = new Scanner(System.in);

public static void main(String[] args) {

    System.out.println("Ingrese un numero");
    Double numero1 = leer.nextDouble();

    System.out.println("Ingrese un numero");
    Double numero2 = leer.nextDouble();

    System.out.println("Ingrese un numero");
    Double numero3 = leer.nextDouble();

    if(numero1.equals(numero3)||numero2.equals(numero3)||numero1.equals(numero2)){
         System.out.println("Los numeros deben ser diferentes");
    }else if(numero1>numero2&&numero1>numero3){
        System.out.println("El mayor es el"+numero1);
    }else if(numero2>numero1&&numero2>numero3){
        System.out.println("El mayor es el"+numero2);
    }else if (numero3>numero1&&numero3>numero2){
        System.out.println("El mayor numero es el"+numero3);
    }else{
        System.out.println("Ingrese un numero valido");
    }
   
    
}


}
    

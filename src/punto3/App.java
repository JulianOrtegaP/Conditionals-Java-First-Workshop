package punto3;

import java.util.Scanner;

// Elabore un algoritmo que lea el nombre, el salario bruto, las
// deducciones y las bonificaciones de dos trabajadores, e
// imprima (escriba un mensaje) el nombre del que más
// // salario neto tiene.

public class App {

   static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // Nombre 1ra persona

        System.out.println("Ingrese su nombre");
        String nombre1 = leer.next();

        // Ingrese su salario

        System.out.println("Ingrese su salario");
        Double salario1 = leer.nextDouble();

        // Ingrese sus deducciones

        System.out.println("Ingrese su deducciones");
        Double deduccion1 = leer.nextDouble();

        // Ingrese sus bonificaciones

        System.out.println("Ingrese su bonificaciones");
        Double bonificacion1 = leer.nextDouble();



                // Nombre 2ra persona

        System.out.println("Ingrese su nombre");
        String nombre2 = leer.next();

        // Ingrese su salario

        System.out.println("Ingrese su salario");
        Double salario2 = leer.nextDouble();

        // Ingrese sus deducciones

        System.out.println("Ingrese su deducciones");
        Double deduccion2 = leer.nextDouble();

        // Ingrese sus bonificaciones

        System.out.println("Ingrese su bonificaciones");
        Double bonificacion2 = leer.nextDouble();

        if(salario1 + bonificacion1+(-deduccion1)>salario2+bonificacion2+(-deduccion2)){
            System.out.println("El mayor salario es el de"+""+  nombre1);
            }else{
              System.out.println("El mayor salario es el de"+""+  nombre2);  
            }
        }


        
    }
    


package punto4;

import java.util.Scanner;

// Crear un algoritmo que le permita al usuario ingresar los
// datos de dos buses así: Placa, El número de pasajeros
// transportado y el valor del pasaje, y el computador le
// muestre la placa del bus que más dinero recogió.

public class App {

    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Placa 1
        System.out.println("Ingrese su numero de placa");
        String placa1 = leer.next();
       

        // Pasajeros1
        System.out.println("Ingrese el numero de pasajero");
        Integer pasajeros1 = leer.nextInt();
        

        //Valor de pasaje
        System.out.println("Ingrese el valor del pasaje");
        Double pasaje1 = leer.nextDouble();
        


        // Placa 2
        System.out.println("Ingrese su numero de placa");
        String placa2 = leer.next();
        

        // Pasajeros2
        System.out.println("Ingrese el numero de pasajero");
        Integer pasajeros2 = leer.nextInt();
        

        //Valor de pasaje
        System.out.println("Ingrese el valor del pasaje");
        Double pasaje2 = leer.nextDouble();

        if((pasajeros1 *pasaje1)>(pasajeros2*pasaje2)){
            System.out.println("el bus que mas plata recogio fue el"+ ""+ placa1);
        }else{
            System.out.println("el bus que mas plata recogio fue el"+ ""+ placa2);
        }
        
    }
}

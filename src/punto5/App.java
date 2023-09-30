package punto5;

import java.util.Scanner;


// Elaborar un algoritmo donde el usuario ingrese la placa de
// un bus, el número de pasajeros transportados y la ruta
// donde prestó el servicio (A o B) el computador le debe
// mostrar el dinero que recolectó sabiendo que en la ruta A
// el pasaje es a $1.200 y en la B a $1.000.

public class App {
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {

        String rutaA ="A";
        String rutaB = "B";

        Integer costoA = 1200;
        Integer costoB = 1000;
        
        System.out.println("Ingrese su placa");
        String placa = leer.next();

        System.out.println("Ingrese numero de pasajeros");
        Integer pasajeros1 = leer.nextInt();

        System.out.println("Ingrese la ruta donde presto el servicio");
        String ruta = leer.next().toUpperCase();

        if(ruta.equals(rutaA)){
            System.out.println("El dinero que recolecto la placa es"+placa+ (costoA*pasajeros1));  
        }else if (ruta.equals(rutaB)){
            System.out.println("El dinero que recolecto la placa es"+placa+ (costoB*pasajeros1));
        }else{
            System.out.println("Su ruta no existe");
        }
        



    }
    
}

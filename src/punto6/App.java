package punto6;

import java.util.Scanner;

// Crear un algoritmo que le permita al usuario ingresar el tipo
// de trabajador (FIJO o TEMPORAL) y con base en esto
// pueda imprimir el nombre y el salario neto, sabiendo que si
// es FIJO debe leer el nombre, el número de horas
// trabajadas, el salario básico hora, el total de deducciones y
// el total de bonificaciones y si es TEMPORAL solo debe leer
// el nombre y el número de horas trabajadas; estos
// trabajadores tienen un salario básico hora fijo de $6.000 y
// no tienen deducciones ni bonificaciones.

public class App {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        String fijo = "FIJO";
        String temporal = "TEMPORAL";
        Double salarioBasico = 6000.0;
        String nombreTrabajador = "Stiven";
        Double horasTrabajadas = 48.0;
        Double totalDeducciones = 0.0;
        Double bonificaciones = 0.0;
        
        System.out.println("Ingrese el tipo de trabajador");

        String trabajador = leer.next().toUpperCase();

        if(trabajador.equals(fijo)){
            System.out.println(
                "Nombre:"+nombreTrabajador+
                "Salario Neto:"+((horasTrabajadas*salarioBasico)+(bonificaciones)-(totalDeducciones))+
                "Numero de horas trabajadas :"+horasTrabajadas+
                "Salario basico hora"+salarioBasico+
                "Total de deducciones:"+totalDeducciones+
                "Total Bonificaciones:"+bonificaciones
            );
        }else if(trabajador.equals(temporal)){
            System.out.println(
                "Nombre:"+nombreTrabajador+
                "Numero de horas trabajadas :"+horasTrabajadas
            );
        }else{
            System.out.println("Empleado no registrado");
        }


    }

    
}

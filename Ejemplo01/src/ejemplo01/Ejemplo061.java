/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        // Uso de printf
        // f: formato

        String nombreEstudiante = "Giovanna Alexandra";
        String apellidoEstudiante = "Castro Bustamante";
        String direccion = "Urb. Arquitectos";
        String universidad = "UTPL";
        String asignatura = "Introduccion a la programacion";
        String paralelo = "C";
        int edad = 17;
        int ciclo = 1;

        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%s\nCiclo:\n\t%s\nDireccion:\n\t%s\nDireccion:\n\t%s\nUniversidad:\n\t%s\nAsignatura:\n\t%s\nParalelo:\n", nombreEstudiante,
                apellidoEstudiante, edad, ciclo, direccion, universidad, asignatura, paralelo);

    }
}

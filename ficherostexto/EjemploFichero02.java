package ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File Escritura en un fichero de texto
*
* @author Luis José Sánchez
*/
public class EjemploFichero02 {
public static void main(String[] args) {
try {
BufferedWriter bw = new BufferedWriter(new
FileWriter("c:\\prueba\\frutas.txt"));
//no añade, pisa el fichero con los datos que se metan si se ejecuta de nuevo
bw.write("La Sandia\n");
bw.write("El Platano\n");
bw.write("El Aguacate\n");
bw.write("Las Uvas\n");
System.out.println("Fichero creado");
bw.close();
} catch (IOException ioe) {
System.out.println("No se ha podido escribir en el fichero");
}
}
}
package ficherostexto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFichero3 {
public static void main(String[] args) {
try {
BufferedReader br = new BufferedReader(new
FileReader("asignaturasdam.txt"));
String linea = "";
System.out.println("Asignaturas de 1º de DAM:");
while (linea != null) {
linea = br.readLine();
if (linea != null) {
System.out.println(linea);
}
}
br.close();
} catch (IOException ioe) { 
System.out.println("No se puede leer el fichero asignatura.txt");
}
}
}
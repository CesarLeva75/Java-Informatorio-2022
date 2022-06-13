
import java.util.Scanner;

public class ejercicio1{

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        nombre = nombre.toUpperCase();
        System.out.println("Bienvenido, " + nombre);
        
    }
}
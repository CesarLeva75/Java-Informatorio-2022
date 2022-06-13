import java.util.Scanner;

/*Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces 
que aparece una letra dada.
Input (Entrada):
Hola Informatorio Java 2022.
a


Output (Salida):
4



 */
public class ejercicio9 {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingrese una frase: ");
            String fra = scan.nextLine();

            System.out.println("Ingrese la letra que desea buscar: ");
            String letra = scan.nextLine();

            scan.close();

            int contador = 0;

            for (int i = 0; i < fra.length(); ++i){

                if ( letra.charAt(0) == fra.charAt(i)) {

                    contador += 1;

                }


            }

            System.out.println("La letra " + letra + " se encuentra " + contador + " veces.");
        }
    }
}

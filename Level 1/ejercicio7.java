import java.util.Scanner;

/*Realizar un programa que dado un String de entrada en minúsculas lo convierta 
por completo a mayúsculas. Sin uso de métodos o librerías que realicen 
toUppercase().
 Input (Entrada):
informatorio

Output (Salida):
INFORMATORIO

 */
public class ejercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una palabara en minuscula: ");

        String pal = scan.nextLine();

        scan.close();

        String abC = "QWERTYUIOPASDFGHJKLÑZXCVBNM";

        String abc = "qwertyuiopasdfghjklñzxcvbnm";

        for (int i = 0; i < pal.length(); ++i){

            for (int a = 0; a < abc.length(); ++a){

                if (pal.charAt(i) == abc.charAt(a)) {

                        System.out.print(abC.charAt(a));
                    
                }

            }


        }


    }
    
}

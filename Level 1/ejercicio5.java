import java.util.Scanner;

/* Se desea una aplicación que solicite 2 números enteros y realice la operación 
de multiplicación por sumas sucesivas (sin uso de librerías).
Input (Entrada):
2
3

Output (Salida):
2 x 3 = 6

*/
public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese un número Entero: ");

        int n1 = scan.nextInt();

        System.out.println("Por favor ingrese otro número Entero: ");
        
        int n2 = scan.nextInt();

        int res = 0;

        for ( int i= 0; i < n1; ++i){

            res += n2;       

        }

        System.out.println(n1 + " x " + n2 + " = " + res);

        scan.close();

    }

}

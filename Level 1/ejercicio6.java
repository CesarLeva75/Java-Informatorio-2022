import java.util.Scanner;

/*Se desea una aplicación que solicite 2 números enteros y realice la operación 
de potencia (sin uso de librerías).
Input (Entrada):
3
3

Output (Salida):
3 elevado a 3 = 27

 */
public class ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese la base (un numero número Entero): ");

        int n1 = scan.nextInt();
        
        System.out.println("Por favor ingrese la potencia (un número Entero): ");
        int n2 = scan.nextInt();
        
        scan.close();

        int res = n1;

        for ( int i= 1; i < n2; ++i){
      
            res *=n1;

        }

        System.out.println(n1 + " elevado a la " + n2 + " = " + res);

        



    }
    
}

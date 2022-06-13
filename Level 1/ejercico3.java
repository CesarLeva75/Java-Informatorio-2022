import java.util.Scanner;

/*Confeccionar un programa que dado un número entero como dato de entrada 
imprima la secuencia de números (incrementos de 1) de la siguiente forma:
Input (Entrada):
5

Output (Salida):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */
public class ejercico3 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Ingresar un numero entero: ");
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <=num; ++i){

            for ( int n = 1; n <= i; ++n) {

                System.out.print(n);

            }
            System.out.println(" ");
        }
    }
    
    }


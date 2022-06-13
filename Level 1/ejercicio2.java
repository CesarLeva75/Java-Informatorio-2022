import java.util.Scanner;
/*Realizar un programa que solicite por consola 2 números enteros. Para luego 
imprimir el resultado de la suma, resta, multiplicación, división y 
módulo (resto de la división) de ambos números.
Input (Entrada):
5
4

Output (Salida):
5 + 4 = 9
5 - 4 = 1
5 * 4 = 20
5 / 4 = 1
5 % 4 = 1

 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Ingresar un numero entero: ");
        int n1 = scan.nextInt();
        System.out.println("Ingresar otro numero entero: ");
        int n2 = scan.nextInt();
        scan.close();

        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
        
    }
    
}

import java.util.Scanner;
/* Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
Input (Entrada):
5

Output (Salida):
El factorial de 5 es: 120


*/
public class ejercicio4 {
   
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
    
            System.out.println("Por favor ingrese un numero Entero: ");
            int num = scan.nextInt();
    
            scan.close();
    
            var mul = 1;
    
            for (int i = 1; i <= num; ++i){
    
                mul *=i;
                
            }
    
            System.out.println(mul);
    
        }

}

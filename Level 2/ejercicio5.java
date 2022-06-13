import java.util.ArrayList;
import java.util.List;

/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del 
resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga 
los totales y luego imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

## Los arrays son iguales y corresponden a los días trabajados de una semana 
Lun-Vie.

Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915

 */
public class ejercicio5 {
    public static void main(String[] args) {

        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> total = new ArrayList<>();

        // horas trabagadas por dia         // valor por dias
        horasTrabajadas.add(6);              valorPorHora.add(350);
        horasTrabajadas.add(7);              valorPorHora.add(345);
        horasTrabajadas.add(8);              valorPorHora.add(550);
        horasTrabajadas.add(4);              valorPorHora.add(600);
        horasTrabajadas.add(5);              valorPorHora.add(320);
       

        // calculando el total de la dos lista y agregando a otra lista 
        for (int i = 0 ;  i < horasTrabajadas.size() ; ++i){

            int t = horasTrabajadas.get(i) * valorPorHora.get(i);

            total.add(t);

        }

        // imprime el total
        int totalA = 0;

        for (Integer t : total) {

            totalA += t;
        }
        System.out.println(total);
        System.out.println("Total de horas trabajada: " + totalA);
        
    }
    
}

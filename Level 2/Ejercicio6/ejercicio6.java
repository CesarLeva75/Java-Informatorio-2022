package Ejercicio6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo 
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map 
(o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
 */
public class ejercicio6 {
    
    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<String, Integer> sueldoTotal = new HashMap<>();

        Empleado e1 = new Empleado("Jose", "4500", 45, 600);
        Empleado e2 = new Empleado("Carlos", "2547", 30, 687);

        empleados.add(e1);
        empleados.add(e2);

        for (Empleado empleado : empleados) {

            System.out.println(empleado);
        }
        
        sueldoTotal.put(e1.obtDni(), e1.sueldo());
        sueldoTotal.put(e2.obtDni(), e2.sueldo());

        System.out.println(sueldoTotal);
       

    }
    
}

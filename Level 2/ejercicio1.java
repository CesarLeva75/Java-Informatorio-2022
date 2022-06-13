import java.util.ArrayList;
import java.util.List;
/*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego 
imprimir por pantalla el ranking
Input (Entrada):
Bariloche
Córdoba
Resistencia

Output (Salida):
#1 - Bariloche
#2 - Córdoba
#3 - Resistencia


ArrayList es una clase contenedora genérica que implementa arrays dinámicos 
de objetos de cualquier tipo.
ArrayList nombreArray = new ArrayList();
Por ejemplo:
ArrayList a = new ArrayList();   
a.add("Lenguaje");
a.add(3);
a.add('a');
a.add(23.5);

 */
public class ejercicio1 {
    public static void main(String[] args) {
        
        List<String> ciudades = new ArrayList<>();

        rankingCiudad(ciudades);

        int cont = 0;

        for (String ciu : ciudades) {
            
            System.out.println("#"+ (cont += 1) + " - " +ciu);

        }

    }

    public static void rankingCiudad(List<String>  ciudades) {
        ciudades.add("Resistencia");
        ciudades.add("San Martin de los Andes");
        ciudades.add("Entre Rios");
    }
}

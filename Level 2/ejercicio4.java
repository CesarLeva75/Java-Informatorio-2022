/*Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos 
(3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?

 */
import java.util.ArrayList;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {
        

        List<String> alumnos = new ArrayList<>();

        alumnos.add("Cesar");
        alumnos.add("Eduardo");
        alumnos.add("Carlos");
        alumnos.add("Marina");
        alumnos.add("Roberto");
        alumnos.add("Josefa");
        alumnos.add("Pablo");
        alumnos.add("Pedro");
        alumnos.add("Juana");
        alumnos.add("Gaston");
        alumnos.add("Lorena");
        alumnos.add("Abel");

        List<String> grumo1 = alumnos.subList(0, 4);

        List<String> grumo2 = alumnos.subList(4, 8);

        List<String> grumo3 = alumnos.subList(8, 12);

        System.out.println("Grupo 1");

        for (String g1 : grumo1) {

            System.out.println(g1);
            
        }

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.println("Grupo 2");

        for (String g2 : grumo2) {

            System.out.println(g2);

        }

        System.out.println("________________________________");
        System.out.println("________________________________");

        System.out.println("Grupo 3");

        for (String g3 : grumo3) {
            
            System.out.println(g3);
            
        }

        




    }
    
}

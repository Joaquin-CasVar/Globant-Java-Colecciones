package coleccionesact1;

// @author Haze

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionesAct1 {

    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String res = "S";
        
        while (!res.equalsIgnoreCase("N")) {
            System.out.println("Ingrese una raza de perro");
            perros.add(input.next());
            System.out.println("Quiere guardar otro perro.(S/N)");
            res = (input.next());
        }
        System.out.println("Lista de perros cargada:");
        perros.forEach(aux -> System.out.println(aux));
    }

}

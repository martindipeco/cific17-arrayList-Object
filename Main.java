import java.util.ArrayList;
import java.util.Scanner;

//programa que permita agregar personas con sus datos y luego mostrar la lista de personas ingresadas con ArrayList
//Cada ArrayList<Oject> es la etapa previa a definir una Clase, con sus atributos
//El ArrayList de ArrayList se asemeja a la persistencia con alguna base de datos
public class Main
{
    public static void main(String[] args) {
        // Lista que contiene las personas
        ArrayList<ArrayList<Object>> listaPersonas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;
        
        do {
            // Crear una nueva persona
            ArrayList<Object> persona = new ArrayList<>();

            // Solicitar y agregar los datos de la persona
            System.out.print("Ingrese el nombre de la persona: ");
            persona.add(scanner.nextLine());

            System.out.print("Ingrese el apellido: ");
            persona.add(scanner.nextLine());

            System.out.print("Ingrese la edad: ");
            //Falta hacer la validación por dato numérico entero
            persona.add(Integer.parseInt(scanner.nextLine()));

            System.out.print("Ingrese el salario: ");
            //Falta hacer la validación por dato numérico flotante
            persona.add(Double.parseDouble(scanner.nextLine()));

            // Agregar la persona a la lista de personas
            listaPersonas.add(persona);

            // Preguntar si desea continuar
            System.out.print("¿Desea agregar otra persona? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar la lista de personas ingresadas
        System.out.println("\nLista de personas ingresadas:");
        for (ArrayList<Object> persona : listaPersonas) {
            System.out.println("Nombre: " + persona.get(0) +
                    ", Apellido: " + persona.get(1) +
                    ", Edad: " + persona.get(2) +
                    ", Salario: " + persona.get(3));
        }
        
    }
}

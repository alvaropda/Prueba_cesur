import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> alumnos = new HashMap<>();

        System.out.print("¿Cuántos alumnos quieres ingresar? ");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingresa el nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa la nota de " + nombre + ": ");
            int nota = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            alumnos.put(nombre, nota);
        }

        System.out.print("Ingresa el nombre del alumno para consultar su nota: ");
        String nombreConsulta = scanner.nextLine();

        if (alumnos.containsKey(nombreConsulta))
            System.out.println("La nota de " + nombreConsulta + " es: " + alumnos.get(nombreConsulta));
        else
            System.out.println("Alumno no encontrado.");
        scanner.close();
    }
}

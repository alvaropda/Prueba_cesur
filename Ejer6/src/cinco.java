import java.util.Scanner;
public class cinco {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime el nº de alumnos: ");
        int alumno= sc.nextInt();
        System.out.print("dime el nº de alumnas");
        int alumna= sc.nextInt();
        System.out.println(alumno*100.0/(alumno+alumna)+"% de alumnos");
        System.out.println(alumna*100.0/(alumno+alumna)+"% de alumnas");
    }
}

import java.util.Scanner;
public class tres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nº de alumnos: ");
        int alumnos = sc.nextInt();
        if (alumnos>=100)
            System.out.print("el costo por cada alumno es 65 euros y a la compañia "+65*alumnos);
        if (alumnos<=99 && alumnos>=50)
            System.out.print("el costo por cada alumno es 70 euros y a la compañia "+70*alumnos);
        if (alumnos<=49 && alumnos>=30)
            System.out.print("el costo por cada alumno es 95 euros y a la compañia " +95*alumnos);
        if (alumnos<30)
            System.out.print("el costo por cada alumno es %.2f "+(3000.0/alumnos)+" euros y a la compañia 3000");
    }
}

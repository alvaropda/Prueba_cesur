import java.util.Scanner;
public class cinco {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("dime el nº de alumnos: ");
        int alumnos= scanner.nextInt();
        double cnt_notas=0;
        double notas;
        for (int cnt=1; cnt<=alumnos; cnt++){
            System.out.print("Dime la nota: ");
            notas= scanner.nextDouble();
            cnt_notas=cnt_notas+notas;
        }
        System.out.print("la media de la clase es: "+cnt_notas/alumnos);
    }
}

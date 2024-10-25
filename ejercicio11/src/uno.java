import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a;
        double b;
        double c;
        do {
            System.out.print("dime nº A: ");
            a = sc.nextDouble();
            System.out.print("dime nº B: ");
            b = sc.nextDouble();
            System.out.print("dime nº C: ");
            c = sc.nextDouble();
        }while (a<0 || c<0 || b<0);
        if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
            System.out.print("Es rectángulo");
        else if (a==b && a==c)
            System.out.print("Es equilátero");
        else if (a==b || a==c || b==c)
            System.out.print("Es isósceles");
        else
            System.out.print("Es escaleno");
    }
}
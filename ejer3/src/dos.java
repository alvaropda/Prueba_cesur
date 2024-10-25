import java.util.Scanner;
public class dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el mes en numérico");
        int mes=sc.nextInt();
        System.out.println("dime el precio");
        double precio=sc.nextDouble();
        sc.close(); //se usa para cerrar el flujo de datos
        if (mes==10){
            System.out.println("el precio es "+((precio*0.15)-precio)*(-1));
        }
        else if (mes!=10){
            System.out.println("el precio es "+precio);
        }
    }
}

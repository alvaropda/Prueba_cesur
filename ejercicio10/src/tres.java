import java.util.Scanner;
public class tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        boolean pregunta=true;
        double total=0;
        do {
            System.out.print("que producto desea: ");
            String  n = sc.next().toLowerCase();
            System.out.print("cuanto vale el producto: ");
            precio = sc.nextDouble();
            double descuento;
            if (precio >= 200) {
                descuento = precio * 0.15;
                precio -= descuento;
            }
            else if (precio >= 100 || precio < 200) {
                descuento = precio * 0.12;
                precio -= descuento;
            }
            else {
                descuento = precio * 0.10;
                precio -= descuento;
            }
            total+=precio;
            System.out.println("el producto seleccionado, ("+n+") cuesta con descuento: "+precio+"€");
            System.out.print("quieres otro articulo? (si o no): ");
            String siono = sc.next().toLowerCase();
            if(siono.equals("no"))
                pregunta=false;
        }while(pregunta);
        System.out.print("el total es: "+total+"€");
    }
}

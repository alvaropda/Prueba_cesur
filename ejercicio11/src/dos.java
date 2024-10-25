import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double precio;
        double kilos;
        do{
            System.out.print("cuanto vale el kilo de uvas (minimo 2€): ");
            precio = sc.nextDouble();
            System.out.print("cuantos kilos tienes: ");
            kilos = sc.nextDouble();
        }while (precio<2 || kilos<0);
        System.out.print("Qué tipo de uva es (A o B): ");
        String tipo = sc.next().toUpperCase();
        switch (tipo){
            case "A" ->{
                System.out.print("Qué tamaño(1 o 2):");
                int tamaño= sc.nextInt();
                if (tamaño==1)
                    precio=precio+0.20;
                else if (tamaño==2)
                    precio=precio+0.30;
                else
                    System.out.print("Error");
            }
            case "B" ->{
                System.out.print("Qué tamaño(1 o 2):");
                int tamaño= sc.nextInt();
                if (tamaño==1)
                    precio=precio-0.30;
                else if (tamaño==2)
                    precio=precio-0.50;
                else
                    System.out.print("Error");
            }
            default -> System.out.print("Error");
        }
        if (tipo.equals("A") || tipo.equals("B"))
            System.out.printf("sacarias %.2f€",(precio*kilos));
    }
}
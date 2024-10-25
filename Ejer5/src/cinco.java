import java.util.Scanner;
public class cinco {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("dime una secuencia de numeros: ");
        int numero= sc.nextInt();
        int mayor=0;

        while (numero!=0){
            if (numero<0)
                System.out.println("no se pueden negativos");
            if(numero>mayor)
                mayor=numero;
            System.out.println("dime una secuencia de numeros: ");
            numero= sc.nextInt();
        }
        System.out.print("el mayor ha sido: "+mayor);
    }
}

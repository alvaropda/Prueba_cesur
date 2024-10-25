import java.util.Random;
import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Dime el nº de intentos: ");
        int intentos = sc.nextInt();

        int dado1 = r.nextInt(6) + 1;
        int dado2 = r.nextInt(6) + 1;
        int suma = dado1 + dado2;
        int cnt = 1;
        boolean flag = true;

        while (cnt <= intentos && flag) {
            System.out.print("Intento nº" + cnt+":");
            int juego = sc.nextInt();

            if (juego < suma)
                System.out.println("Tu suma es menor.");
            else if (juego > suma)
                System.out.println("Tu suma es mayor.");
            else
                System.out.println("Has ganado!!");
                flag = false;

            cnt++;
        }

        System.out.print("El dado 1 era "+dado1+" y el dado 2 era "+dado2+". la suma era "+suma);
    }
}
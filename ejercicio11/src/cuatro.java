import java.util.Scanner;
import java.util.Random;

public class cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int cnt1=0;
        int cnt2=0;

        while (cnt1<3 && cnt2<3) {
            System.out.println("Escoge:\n0-piedra\n1-papel\n2-tijera");
            int jugador = sc.nextInt();
            int bot = ra.nextInt(3);
            if (jugador == 0 && bot == 1) {
                System.out.println("jugador1 pierde (piedra vs papel)");
                cnt2++;
            } else if (jugador == 1 && bot == 2) {
                System.out.println("jugador1 pierde (papel vs tijera)");
                cnt2++;
            } else if (jugador == 2 && bot == 0) {
                System.out.println("jugador1 pierde (tijera vs piedra)");
                cnt2++;
            } else if (jugador == 0 && bot == 2) {
                System.out.println("jugador1 gana (piedra vs tijera)");
                cnt1++;
            } else if (jugador == 1 && bot == 0) {
                System.out.println("jugador1 gana (papel vs piedra)");
                cnt1++;
            } else if (jugador == 2 && bot == 1) {
                System.out.println("jugador1 gana (tijera vs papel)");
                cnt1++;
            } else if(jugador==bot)
                System.out.println("empate, otra ronda");
            else
                System.out.println("opción no valida");
        }
        System.out.println("fin, jugador1: "+cnt1+" jugador2: "+cnt2);
    }
}
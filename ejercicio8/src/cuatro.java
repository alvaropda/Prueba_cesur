import java.util.Scanner;
public class cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("di la cantidad: ");
        int cantidad = sc.nextInt();
        int cnt=0;
            while (cantidad >= 500) {
                cantidad -= 500;
                cnt++;
            }
            System.out.println("billetes de 500: "+cnt);
            cnt=0;
            while (cantidad >= 200) {
                cantidad -= 200;
                cnt++;
            }
            System.out.println("billetes de 200: "+cnt);
            cnt=0;
            while (cantidad >= 100) {
                cantidad -= 100;
                cnt++;
            }
            System.out.println("billetes de 100: "+cnt);
            cnt=0;
            while (cantidad >= 50) {
                cantidad -= 50;
                cnt++;
            }
            System.out.println("billetes de 50: "+cnt);
            cnt=0;
            while (cantidad >= 20) {
                cnt=0;
                cantidad -= 20;
                cnt++;
            }
        System.out.println("billetes de 20: "+cnt);
            while (cantidad >= 10) {
                cantidad -= 10;
                cnt++;
            }
        System.out.println("billetes de 10: "+cnt);
        cnt=0;
            while (cantidad >= 5) {
                cantidad -= 5;
                cnt++;
            }
        System.out.println("billetes de 5: "+cnt);
        cnt=0;
            while (cantidad >= 2) {
                cantidad -= 2;
                cnt++;
            }
        System.out.println("monedas de 2: "+cnt);
        cnt=0;
            while (cantidad == 1) {
                cantidad -= 1;
                cnt++;
            }
        System.out.println("monedas de 1: "+cnt);
        }
    }
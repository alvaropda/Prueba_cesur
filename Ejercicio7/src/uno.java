import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt;
        do {
            System.out.print("di el nº de veces (mayor que 0): ");
            cnt = sc.nextInt();
        } while (cnt <= 0);
        int comprobacion = 9999999;
        int menor = -9999999;
        int suma = 0;
        int cnt_pares = 0;
        int numero;
        for (int i = 1; i <= cnt; i++) {
            System.out.print("dime el nº" + i + ": ");
            numero = sc.nextInt();
            if (comprobacion < numero)
                comprobacion = numero;
            if (menor >= numero)
                menor = numero;
            if (numero % 2 == 0 && numero != 0) {
                suma = suma + numero;
                cnt_pares++;
            }
        }
        System.out.println("el mayor es " + comprobacion);
        System.out.println("el menor es " + menor);
        if(cnt_pares>0)
            System.out.print("la media de los pares es " + suma * 1.0 / cnt_pares);
        else
            System.out.print("no hay pares");
    }
}

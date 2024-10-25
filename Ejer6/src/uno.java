import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma_par = 0;
        int suma_impar = 0;
        int pares = 0;
        int impares = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.print("dime el nº " + i + ": ");
                numero = sc.nextInt();
                if (numero%2==0 && numero!=0) {
                    suma_par = suma_par + numero;
                    pares++;
                } else {
                    impares++;
                    suma_impar = suma_impar + numero;
                }
            }
        System.out.println("hay "+pares+" pares");
        System.out.println("la suma de los pares es "+suma_par);
        System.out.print("la media de impares es "+suma_impar*1.0/impares);
    }
}

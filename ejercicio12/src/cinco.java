import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un nº: ");
        int num = sc.nextInt();

        int ceros = 1;
        int calculo = 0;
        int modulo = 0;
        int suma = 0;

        while (num>0){
            modulo = num % 10;
            calculo = num / 10;
            suma += Math.pow(calculo, 3);
            num = calculo;
        }
        if (num == suma)
            System.out.print("es narcisista");
        else
            System.out.print("no es narcisista");
    }
}

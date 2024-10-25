import java.util.Random;
import java.util.Scanner;
public class cuatro {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("dime el nº maximo posible: ");
        int numero= sc.nextInt();
        System.out.println("cuantos intentos quieres: ");
        int intentos=sc.nextInt();
        int aleatorio=r.nextInt(numero)+1;
        boolean parar=true;
        int cnt=0;
        while (cnt <= intentos && parar){
            System.out.print("di que numero crees que es: ");
            int adivino=sc.nextInt();
            if (adivino == aleatorio) {
                System.out.println("enhorabuena!!!");
                parar = false;
            }
            else if (adivino < aleatorio)
                System.out.println("error el numero es mayor, te quedan "+(intentos-cnt)+" intentos");
            else
                System.out.println("error el numero es menor, te quedan "+(intentos-cnt)+" intentos");
            cnt++;
        }
    }
}

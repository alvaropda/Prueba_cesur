import java.util.Scanner;
public class tres {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime un nº: ");
        int numero= sc.nextInt();
        int elevado=2;
        for(int i=1; i<=5; i++){
            System.out.print("el cuadrado de "+numero+" es "+Math.pow(numero,elevado));
            System.out.println(" y el cubo es "+Math.pow(numero,elevado+1));
            numero++;
        }
    }
}

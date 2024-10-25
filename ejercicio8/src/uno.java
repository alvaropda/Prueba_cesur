import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dame un nº: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

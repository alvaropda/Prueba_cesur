import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dime nº: ");
        int tamaño = sc.nextInt();
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                if ((i == 1) || (i == tamaño)) {
                    System.out.print("*");
                }
                else {
                    if (j==1 || j==tamaño)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu año de nacimiento");
        int año=sc.nextInt();
        System.out.println((año-2024)*(-1));
    }
}

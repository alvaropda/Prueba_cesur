import java.util.Scanner;
public class tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu nombre");
        String nombre =sc.nextLine();
        System.out.println("dime tu sueldo");
        int sueldo = sc.nextInt();
        sc.close();
        System.out.println("el sueldo liquido de "+nombre+" es "+((sueldo*0.8)));
    }
}
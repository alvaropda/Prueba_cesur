import java.util.Scanner;
public class dos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime el dia: ");
        String dia= sc.nextLine();

        switch (dia.toLowerCase()){
            case "lunes","martes","miercoles","jueves","viernes" -> System.out.println("es laborable");
            case "sabado","domingo" -> System.out.print("no es laborable");
            default -> System.out.print("no es un dia valido");
        }
    }
}

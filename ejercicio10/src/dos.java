import java.util.Scanner;
public class dos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("cuantas horas has trabajado: ");
        int horas= sc.nextInt();
        System.out.print("que turno, ¿dia o noche?: ");
        String turno=sc.next().toLowerCase();
        System.out.print("¿festivo o laborable?: ");
        String dia=sc.next().toLowerCase();
        double dinero=0;
        switch (turno){
            case "dia" ->{
                dinero = horas * 10;
                if (dia.equals("festivo"))
                    dinero*=1.1;
            }
            case "noche"->{
                dinero=horas*13.5;
                if (dia.equals("festivo"))
                    dinero*=1.15;
            }
        }
        System.out.printf("cobraras:%.2f",dinero+"€");
    }
}
import java.util.Scanner;
public class cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num=sc.nextInt();
        if(num<4){
            System.out.println("insuficiente");
        }
        else if((num>=4)&&(num<6)){
            System.out.println("regular");
        }
        else if((num>=6)&&(num<7)) {
            System.out.println("bien");
        }
        else if((num>=7)&&(num<9)) {
            System.out.println("notable");
        }
        else if((num>=9)&&(num<=10)) {
            System.out.println("sobresaliente");
        }
    }
}


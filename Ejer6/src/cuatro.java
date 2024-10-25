import java.util.Scanner;
public class cuatro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime el 1er numero:");
        int num1= sc.nextInt();
        System.out.print("dime el 2do numero:");
        int num2= sc.nextInt();

        int caja=num1;
        num1=num2;
        num2=caja;

        System.out.print("A vale:"+num1+" y B vale:"+num2);
    }
}

import java.util.Scanner;
public class dos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime un año: ");
        int año=sc.nextInt();
        if (año%4==0 && año%100!=0)
            System.out.print("es bisiesto");
        else if (año%100==0 && año%400==0)
            System.out.print("es bisiesto");
        else
            System.out.print("no es bisiesto");
    }
}

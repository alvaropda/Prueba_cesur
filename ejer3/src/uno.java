import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe un numero");
        int num1=sc.nextInt();
        System.out.println("escribe otro numero");
        int num2=sc.nextInt();
        if (num1>num2){
            System.out.println(num1/num2);
        }
        else if (num2>num1){
            System.out.print(num2/num1);
        }
        else if (num1==num2){
            System.out.println("los numeros no pueden ser iguales");
        }
    }
}

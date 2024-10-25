import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        System.out.println("Escribe un numero");
        int num=sc.nextInt();
        while(x<=num){
            System.out.println(x);
            x++;
        }
    }
}
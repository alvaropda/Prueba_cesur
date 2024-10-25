import java.util.Scanner;
public class dos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        int cnt_num=1;
        int suma_par=0;
        int suma_impar=0;
        int suma_positivo=0;
        int suma_negativo=0;
        for(int cnt=1; cnt<=10; cnt++){
            System.out.print("dame el nº"+cnt_num+" ");
            num= scanner.nextInt();
            if(num!=0){
                if (num % 2 == 0)
                    suma_par++;
                else
                    suma_impar++;
                if (num > 0)
                    suma_positivo++;
                else
                    suma_negativo++;
            }
            cnt_num++;
        }
        System.out.println("hay "+suma_par+" pares");
        System.out.println("hay "+suma_impar+" impares");
        System.out.println("hay "+suma_positivo+" positivos");
        System.out.print("hay "+suma_negativo+" negativo");
    }
}

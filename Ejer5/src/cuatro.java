import java.util.Scanner;
public class cuatro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime un nº: ");
        double num1=sc.nextInt();
        System.out.print("dime otro nº: ");
        double num2=sc.nextInt();
        double operacion;
        double suma=0;
        if(num1>num2){
            for(int i=100; i<=1000; i++){
                if((operacion= (double) (i * (i + 1)) /5)%5==0)
                    suma=suma+i;
            }
            System.out.println(suma);
        }
        else if(num1==num2){
            for(int i=1; i<=45; i=i+4){
                operacion=i/num1;
                suma=suma+operacion;
            }
            System.out.println(suma);
        }
        else{
            double total=0;
            int elevado=3;
            for(int i=2; i<=20; i=i+2){
                total=total+(Math.pow(i,elevado));
                elevado=elevado+3;
            }
            System.out.println((num2-num1)*total);
        }
    }
}
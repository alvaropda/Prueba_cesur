import java.util.Scanner;
public class seis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("dime un nº entre 1 y 1000: ");
        int numero= sc.nextInt();
        while(numero<0 || numero>1000) {
            System.out.print("entre 1 y 1000: ");
            numero= sc.nextInt();
        }
            String romano = "";
            int[] numbers={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; //Longitud 13 por el total
            String[] letras={"M", "CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I" }; //Longitud es 13
            for (int i = 0; i < numbers.length; i++) { //.length se pone para que tenga en cuenta los 13 numeros
                while (numero>=numbers[i]){
                    romano+=letras[i];
                    numero-=numbers[i];
                }
            }
            System.out.print("el numero romano es: "+romano);
    }
}
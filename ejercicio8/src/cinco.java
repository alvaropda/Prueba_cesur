import java.util.Scanner;
class cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dime un nº: ");
        int n = sc.nextInt();
        String resultado="";
        int resto;
        int almacen=n;
        while (n>0) {
            resto=n%2;
            resultado=resto+resultado;
            n=n/2;
        }
        System.out.println("el numero en binario es: "+resultado);
        n=almacen;
        resultado="";
        while (n>0) {
            resto=n%8;
            resultado=resto+resultado;
            n=n/8;
        }
        System.out.println("el numero en octal es: "+resultado);
        n=almacen;
        resultado="";
        while (n>0) {
            resto=n%16;
            if(resto==10){
                resultado="A"+resultado;
                n=n/16;
            }
            else if(resto==11){
                resultado="B"+resultado;
                n=n/16;
            }
            else if(resto==12){
                resultado="C"+resultado;
                n=n/16;
            }
            else if(resto==13){
                resultado="D"+resultado;
                n=n/16;
            }
            else if(resto==14){
                resultado="E"+resultado;
                n=n/16;
            }
            else if(resto==15){
                resultado="F"+resultado;
                n=n/16;
            }
            else{
                resultado=resto+resultado;
                n=n/16;
            }
        }
        System.out.print("el numero en hexadecimal es: "+resultado);
    }
}
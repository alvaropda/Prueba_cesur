public class tres {
    public static void main(String[] args) {
        int n=20;
        int operacion=0;
        int suma=0;
        int suma_total=0;
        for(int cnt=20; cnt<=3500; cnt++){
            operacion=n*(n+1)/2;
            if(operacion%7==0){
                suma++;
                suma_total=suma_total+n;
            }
            n++;
            operacion=0;
        }
        System.out.println("el resultado es: "+suma);
        System.out.print("la suma es: "+suma_total);
    }
}

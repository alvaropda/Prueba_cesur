public class EjemploFunciones {

    public static void main(String[] args) {
        saludar(); //función 1
        int resultado = sumar(5, 3); //funcion 2
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void saludar() {
        System.out.println("¡Hola, bienvenido!");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}

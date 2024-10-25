import java.util.Random;

public class ContarHastaHola {
    public static void main(String[] args) {
        int contador = 0;
        String palabra = "";
        Random random = new Random();

        while (!palabra.equals("carlateodio")) {
            palabra = generarPalabraAleatoria(random);
            System.out.println(contador++);
        }

        System.out.println(contador);
    }
    public static String generarPalabraAleatoria(Random random) {
        String letras = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder palabra = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int indiceAleatorio = random.nextInt(letras.length());
            palabra.append(letras.charAt(indiceAleatorio));
        }
        return palabra.toString();
    }
}

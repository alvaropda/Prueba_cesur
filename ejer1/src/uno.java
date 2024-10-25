import java.util.Scanner;

public class uno {
    public static void main(String[] args) {
        int a=0;
        int b=9;
        int c=3;
       if ((a>b)&&(a>c)){
           System.out.println(a);
       }
        else if ((b>a)&&(b>c)){
            System.out.println(b);
        }
        else if ((c>b)&&(c>a)){
            System.out.println(c);
        }
    }
}

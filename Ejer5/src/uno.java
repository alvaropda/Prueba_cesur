import java.util.Scanner;
public class uno {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("dime un nº: ");
        int num1= scanner.nextInt();
        System.out.print("dime otro nº: ");
        int num2= scanner.nextInt();
        if(num1==num2) {
            System.out.print(num1*num2);
        }
        else if(num1>num2){
            System.out.print(num1-num2);
        }
        else {
            System.out.print(num1+num2);
        }
    }
}

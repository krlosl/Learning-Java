import java.util.Scanner;
public class Base{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int b; // base
        int e; // exponente
        int i;
        int resultado;

        System.out.print("Dame una base: ");
        b = sc.nextInt();
        System.out.print("Dame un exponente: ");
        e = sc.nextInt();

        resultado = b;

        for (i = 1; i <e; i++){
            resultado = resultado * b;
        }
        System.out.println(resultado);
    }
}
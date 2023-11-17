import libreria.FNumDaw; //importa el java FNumDaw de libreria
import java.util.Scanner;

public class potenciafinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        int resultado;

        System.out.print("Dime la base: ");
        base = sc.nextInt();

        System.out.print("Dime el exponente: ");
        exponente = sc.nextInt();

        System.out.println("La potencia es: ");
        System.out.println(FNumDaw.potencia(base,exponente));
    }
}
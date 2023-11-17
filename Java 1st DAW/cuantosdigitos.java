import libreria.FNumDaw; //importa desde libreria
import java.util.Scanner;

public class cuantosdigitos {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int digitos;

        System.out.print("Introduce un numero entero: ");
        digitos = sc.nextInt();
        
        System.out.println("El numero " + digitos + " tiene " + FNumDaw.cuantosdigitos(digitos) + " digitos ");
    }
}
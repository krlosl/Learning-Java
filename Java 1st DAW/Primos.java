import libreria.FNumDaw;
import java.util.Scanner;

public class Primos{
    public static void main(String[] args){
        
        int i = 1;
        int cont = 0;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número");
        n = sc.nextInt();

        System.out.println(FNumDaw.primos(n)?"Es primo":"NO es primo");
    }
}
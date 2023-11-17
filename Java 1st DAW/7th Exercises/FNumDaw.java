package libreria; //está en la carpeta libreria
import java.util.Scanner;

public class FNumDaw {
    public static int potencia (int base, int exponente) {
        int resultado;

        resultado = base;

        for(int i = 1; i < exponente; i++) {
            resultado = resultado*base;
        }
        return resultado;
    }
    public static int cuantosdigitos (int digitos) {
        int resultado1;
        int cant = 0;

        while (digitos > 0){
            digitos = digitos /10;
            cant++;
        }
        return cant;
    }
    public static boolean primos (int primo) {
        int i = 1;
        int cont = 0;
        int n;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número");
        n = sc.nextInt();

        while (i <= n){
            if((n % i) == 0){
                cont++;
            }
            i++;
        }    
        if (cont <= 2){
            return true;
        }else{
            return false;
        }
    }
}


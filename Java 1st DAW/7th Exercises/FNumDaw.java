package libreria; //está en la carpeta libreria
import java.util.Scanner;

public class FNumDaw {
    public static double potencia (double base, int exponente) {
       double resultado = Math.pow(base, exponente);
       return resultado;
    }
    public static int cuantosDigitos (int digitos) {
        int resultado1;
        int cant = 0;

        while (digitos > 0){
            digitos = digitos /10;
            cant++;
        }
        return cant;
    }
    public static int voltea(int num) {
        String StringNum = Integer.toString(num);
        String StringNumInvert = new StringBuilder(StringNum).reverse().toString();
        int numeroinvertido = Integer.parseInt(StringNumInvert);
        return numeroinvertido;
    }
    public static boolean esCapicua (int num) {
        int numInvert = voltea(num);
        if (numInvert == num) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean esPrimo (int n) {

        Scanner sc = new Scanner(System.in);
        
        for (int i = n -1; i > 1; i--) {
            if (n % i == 0) {
                return false;
            }
        }return true;
    }
    public static int siguientePrimo (int prim) {
        prim++;
        while (true) {
            esPrimo(prim);
            if (esPrimo(prim)) {
                return prim;
            }else {
                prim++;
            }
        } 
    }
    public static int anteriorPrimo (int antprim) {
        antprim--;
        while (true) {
            esPrimo(antprim);
            if (esPrimo(antprim)) {
                return antprim;
            }else {
                antprim--;
            }
        }
    }
    public static char digitoN (int digito, int posicion) { 
        String numerodigito = String.valueOf(digito);

        char[] algo = numerodigito.toCharArray();

        return algo[posicion];
    }
    public static String parteNumero (int numero, int inicio, int fin) {
        String numeroStr = String.valueOf(numero);

        if (inicio >= 0 && fin < numeroString.length() && inicio <= fin) {
            String subcadena = numeroString.substring(inicio, fin + 1);
        }
        return subcadena;
    }
    public static String pegaNumeros (int num1, int num2) {
        return num1 + "" + num2;
    }  
}

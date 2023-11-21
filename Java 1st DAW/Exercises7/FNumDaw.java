package libreria; //está en la carpeta Exercises7
import java.util.Random;
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
        boolean es = true;
        if (numInvert == num) {
            es = true;
        }else {
            es = false;
        } return es;
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
    public static StringBuilder parteNumero (int numero, int inicio, int fin) {
        String numeros = Integer.toString(numero);
        char[] array = numeros.toCharArray();
        StringBuilder a = new StringBuilder();
        for(int i = inicio; i <= fin; i++) {
            a.append(array[i]);
        } return a;
    }
    public static String pegaNumeros (int num1, int num2) {
        return num1 + "" + num2;
    }
    public static boolean kaprekar (int num) {
        int num1 = (int) Math.pow(num, 2);
        String mitad = Integer.toString(num1);
        int longitud = mitad.length();
        int division = longitud /2;
        StringBuilder mitadizquierda = parteNumero(num, 0, division);
        StringBuilder mitadderecha = parteNumero(num, division, longitud);
        Integer.valueOf(String.valueOf(mitadderecha));
        if (Integer.valueOf(String.valueOf(mitadizquierda)) + Integer.valueOf(String.valueOf(mitadderecha)) == num && longitud == division) {
            return true;
        }return false;
    }
    public static int mil (int i) {
        for (i = 1; i < 1001; i = siguientePrimo(i)) {
            System.out.println(i);
        }
        return i;
    }
    public static int capicua (int c) {
        for (c = 1000; c <= 9999; c++) {
            if (esCapicua(c)) {
                System.out.println(c);
            }
        }
        return c;
    }
    public static void generaArrayInt (int tamanyo, int minimo, int maximo) {
        int[] aleatorio = new int[tamanyo];
        Random random = new Random();
        for (int i = 0; i < tamanyo; i++) {
            int j = random.nextInt(maximo - minimo + 1) + minimo;
            aleatorio[i] = j;
            int total = aleatorio[i];
            System.out.println(total);
        }
        return total;
    }
    public static int minimoArrayInt (int[] a) {
        int numero = 2147483647;
        for (int x = 0; x < a.length; x++) {
            if (a[x] < numero) {
                numero = a[x];
            }
        }
        return numero;
    }
    public static int maximoArrayInt (int[] b) {
        int numero = 2147483647;
        for (int x = 0; x < b.length; x++) {
            if (b[x] < numero) {
                numero = b[x];
            }
        }
        return numero;
    }
    public static int posicionArray (int[] d, int nump) {
        System.out.println(d[nump]);
        return nump;
    }
}
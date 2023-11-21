package Exercises7; //está en la carpeta libreria
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
    public static void mil () {
        for (int i = 1; i < 1001; i = siguientePrimo(i)) {
            System.out.println(i);
        }
    }
    public static void capicua () {
        for (int i = 1000; i <= 9999; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
    }
    public static void generaArrayInt (int tamanyo, int minimo, int maximo) {
        int[] aleatorio = new int[tamanyo];
        Random random = new Random();
        for (int i = 0; i < tamanyo; i++) {
            int j = random.nextInt(maximo - minimo + 1) + minimo;
            aleatorio[i] = j;
            System.out.println(aleatorio[i]);
        }
    }
    public static void minimoArrayInt (int[] a) {
        int numero = 2147483647;
        for (int x = 0; x < a.length; x++) {
            if (a[x] < numero) {
                numero = a[x];
            }
        }
        System.out.println(numero);
    }
    public static void maximoArrayInt (int[] b) {
        int numero = 2147483647;
        for (int x = 0; x < b.length; x++) {
            if (b[x] < numero) {
                numero = b[x];
            }
        }
        System.out.println(numero);
    }
}

package libreria;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int elegir;
        boolean seguir = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Estos son los programas que puedo ejecutar:");
        System.out.println( "1. Doy la potencia de una base y un exponente.          \n " +       
                            "2. Cuento el número de digitos de un número.           \n " + 
                            "3. Le doy la vuelta a un número.                       \n " + 
                            "4. Digo si un número es o no capicua.                  \n " + 
                            "5. Digo si un número es o no primo.                    \n " + 
                            "6. Doy el primo mayor al número que me dan.            \n " + 
                            "7. Doy el primo menor al número que me dan.            \n " + 
                            "8. Doy el digito de una posición de un número.         \n " + 
                            "9. Doy la posición de un digito.                       \n " + 
                            "10. Cojo el inicio y el fin de un número.              \n " + 
                            "11. Pego dos números para formar uno.                  \n " + 
                            "12. Kaprekar.                                          \n " + 
                            "13. Muestro los primos entre 1 y 1000.                 \n " + 
                            "14. Muestro los números capicua entre 1000 y 9999.     \n " + 
                            "15. 210 de Acepta el reto.                             \n " + 
                            "16. 100 y 115 de Acepta el reto.                       \n ");

        while (seguir) {
            System.out.println("Cuál de todos quieres probar? Usa Ctrl + C para salir del programa :)");
            elegir = sc.nextInt();

            switch(elegir) {

                case 1:

                    System.out.println("Dame la base y el exponente de la operación: ");
                        double base = sc.nextInt();
                        int exponente = sc.nextInt();

                        System.out.println(FNumDaw.potencia(base, exponente));

                        System.exit(0);
                break;

                case 2:

                    System.out.print("Dime de que número quieres saber la longitud: ");
                        int cant = sc.nextInt();

                        System.out.println(FNumDaw.cuantosDigitos(cant));

                        System.exit(0);
                break;

                case 3:
                    
                    System.out.println("Dime a que número quieres darle la vuelta: ");
                        int numeroinvertido = sc.nextInt();

                        System.out.println(FNumDaw.voltea(numeroinvertido));

                        System.exit(0);
                break;

                case 4:

                    System.out.println("Dime que número quieres saber si es capicua: ");
                        int num = sc.nextInt();

                        System.out.println(FNumDaw.esCapicua(num));

                        System.exit(0);
                break;

                case 5:

                    System.out.println("Dime que número quieres saber si es primo: ");
                        int n = sc.nextInt();
                        
                        System.out.println(FNumDaw.esPrimo(n));

                        System.exit(0);
                break;

                case 6:

                    System.out.println("Dame un número primo y te daré el siguiente: ");
                    int prim = sc.nextInt();

                    System.out.println(FNumDaw.siguientePrimo(prim));

                    System.exit(0);
                break;

                case 7:

                    System.out.println("Dame un número primo y te daré el anterior: ");
                    int antprim = sc.nextInt();
                    
                    System.out.println(FNumDaw.anteriorPrimo(antprim));

                    System.exit(0);
                break;

                case 8:

                    System.out.print("Dime el número del que quieres extraer un digito: ");
                    int digito = sc.nextInt();
                    
                    System.out.print("Dime la posición que quieres que saque (siendo 0 la posición inicial): ");
                    int posicion = sc.nextInt();

                    System.out.println(FNumDaw.digitoN(digito, posicion));
                    System.exit(0);
                break;

                case 10:
                    
                    System.out.print("Dime el número al que quieres sacarle un trozo:");
                    int numero = sc.nextInt();
                    System.out.print("Dime el inicio del trozo:");
                    int inicio = sc.nextInt();
                    System.out.print("Dime el final del trozo:");
                    int fin = sc.nextInt();

                    System.out.println(FNumDaw.parteNumero(inicio,fin));
                    System.exit(0);

                case 11: 

                    System.out.print("Dime el primer número que quieres juntar: ");
                    int num1 = sc.nextInt();
                    System.out.print("Dime el segundo número que quieres juntar: ");
                    int num2 = sc.nextInt();

                    System.out.println(FNumDaw.pegaNumeros(num1, num2));

                    System.exit(0);
                break;   
            }   
        }
    }
}
import java.util.Scanner;

public class Eja2{
    public static void main (String[] args){

        char[][] tab = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        int row; 
        int col;
        int cont = 0;
        boolean sigue = true;
        Scanner sc = new Scanner (System.in);

        do {

            do{
                System.out.print("Row:");
                row=sc.nextInt();
                System.out.print("Col:");
                col=sc.nextInt();
            }while (tab[row][col] !=' ');

            tab[row][col] = 'X';

             if ((tab[0][0] == 'X' && tab[1][1] == 'X' && tab [2][2] == 'X') ||
            (tab[0][2] == 'X' && tab[1][1] == 'X' && tab [2][0] == 'X') ||
            (tab[row][0] == 'X' && tab[row][1] == 'X' && tab [row][2] == 'X') ||
            (tab[0][col] == 'X' && tab[1][col] == 'X' && tab [2][col] == 'X') ){
            
                sigue = false;

                System.out.println("Usuario gana");
            }

            if(cont == 8){ 
                sigue = false;
            }

            if(sigue){
                do{
                    row=(int)Math.random()*3;
                    col=(int)Math.random()*3;

                }while (tab[row][col] != ' ');


            tab[row][col] = '0';
            System.out.println("PC lanza: " + row + "," + col);

            }
             if ((tab[0][0] == 'X' && tab[1][1] == 'X' && tab [2][2] == 'X') ||
            (tab[0][2] == 'X' && tab[1][1] == 'X' && tab [2][0] == 'X') ||
            (tab[row][0] == 'X' && tab[row][1] == 'X' && tab [row][2] == 'X') ||
            (tab[0][col] == 'X' && tab[1][col] == 'X' && tab [2][col] == 'X') ){
            
                sigue = false;

                System.out.println("PC gana");
            }

            for(int i = 0; i<3; i++ ) {
                for(int j = 0; i<3; j++ ) {
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }

            cont++;

        }while (cont < 9 );
    }
}
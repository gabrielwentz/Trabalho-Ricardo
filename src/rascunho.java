import java.util.Scanner;

public class rascunho {

    public static int [][] leituraDeMatriz(int l, int c) {
        int [][] matriz = new int [l][c];
        return matriz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas, colunas;
        int m [][];

        System.out.println("Informe a quantidade de linhas da matriz. ");
        linhas = scanner.nextInt();

        System.out.println("Informa a quantidade de colunas da matriz. ");
        colunas = scanner.nextInt();

        m = leituraDeMatriz(linhas, colunas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf(m[i][j] + " ");
            }
            System.out.println();
        }






    }
}

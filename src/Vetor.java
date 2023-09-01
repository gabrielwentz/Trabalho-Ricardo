public class Vetor {

    public static void main(String[] args) {
        int [][] matriz = new int [5][2];
        int i = 0;
        int j = 0;

        matriz[0][1] = 132;
        matriz[2][0] = 140;

        while (i < 5) {
            j = 0;
            while (j < 2) {
                System.out.print(matriz[i][j] + "  ");
                j = j + 1;
            }
            System.out.println(" ");
            i = i + 1;
        }
    }
}

import java.util.Scanner;

public class Exercicio2 {

    public static void comparadorDeNumeros(int n1, int n2) {
        if (n1 > n2) {
            System.out.println("Número 1 é maior que o Número 2.");
        } else {
            System.out.println("Número 2 é maior que o Número 1.");
        }
    }

    public static int leituraDeNumeros() {
        int numero;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número.");
        numero = leitura.nextInt();
        System.out.println("Valor lido é igual a: " + numero);


        return numero;
    }


    public static void main(String[] args) {
        int n1, n2;
        n1 = leituraDeNumeros();
        n2 = leituraDeNumeros();

        n1 = leituraDeNumeros();
        n2 = leituraDeNumeros();

    }
}












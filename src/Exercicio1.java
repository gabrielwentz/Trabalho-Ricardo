import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {
        int numero1, numero2;
        Scanner leitura = new Scanner(System.in);
        numero1 = leitura.nextInt();
        System.out.println(numero1);
        numero2 = leitura.nextInt();
        System.out.println(numero2);
        if (numero1 > numero2) {
            System.out.println("O primeiro número digitado é maior.");
        } else  {
            System.out.println("O segundo número digitado é maior.");
        }





    }
}

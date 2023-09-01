import java.util.Scanner;

public class Exemplo {


    public static void main(String[] args) {
        int numero1, numero2;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número.");
        numero1 = leitura.nextInt();
        System.out.println("Valor do número 1 é igual a: " + numero1);
        System.out.println("Informe outro número.");
        numero2 = leitura.nextInt();
        System.out.println("Valor do número 2 é igual a: " + numero2);
    }

    }


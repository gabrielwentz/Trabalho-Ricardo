import java.util.Scanner;

public class Menu {

    public static void cantar(){
        System.out.println("Estou cantando...");
    }

    public static void correr(){
        System.out.println("Estou correndo...");
    }

    public static void dormir(){
        System.out.println("Estou dormindo...");
    }
    public static void comer(){
        System.out.println("Estou comendo...");
    }

    public static void sair() {
        System.out.println("Você saiu do menu. ");
    }
    public static void main(String[] args) {
        int op;
        Scanner scanner = new Scanner(System.in);
        op = scanner.nextInt();

        System.out.println("1: Vetor");
        System.out.println("2: Matriz");

            System.out.println("Escolha uma operação: ");
            System.out.println("0: Sair do Menu. ");
            System.out.println("1: Cantar. ");
            System.out.println("2: Correr. ");
            System.out.println("3: Dormir. ");
            System.out.println("4: Comer. ");


            if (op < 0 || op > 4) {
                System.out.println("Operação inválida.");
            } else {
                if (op == 0) {
                    sair();
                } else if (op == 1) {
                    cantar();
                } else if (op == 2) {
                    correr();
                } else if (op == 3) {
                    dormir();
                } else {
                    comer();
                }

            }
        }
        }




import java.util.Scanner;

public class atividadeRicardo1 {


    public static int [] criarVetor() {     //Classe de Criar Vetor
        int tamVetor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você irá criar o vetor.");
        System.out.println("Digite o tamanho do vetor.");
        tamVetor = scanner.nextInt();
        int [] vetor = new int[tamVetor];
        for (int i = 0; i < tamVetor; i++) {
            System.out.println("Digite o elemento" + (i+1) + " ");

            vetor[i] = scanner.nextInt();
        }
        System.out.println("Seu vetor foi criado.");
        return vetor;

    }

    public static int [] visualizarVetor(int [] vetor) {            //Classe de Visualizar o Vetor
        if (vetor != null) {
            System.out.println("Vetor: ");
            for (int i = 0; i < vetor.length ; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Você não criou nenhum vetor.");
        }
        return vetor;
    }


    public static int [] editarVetor(int [] vetor) {               //Classe de Editar o vetor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a posição a ser editada (1 a " + vetor.length + "): ");
        int posicao = scanner.nextInt();

        if (posicao < 1 || posicao > vetor.length) {
            System.out.println("Posição inválida.");
        }  else {
            System.out.println("Digite o novo valor: ");
            int novoValor = scanner.nextInt();
            vetor[posicao - 1] = novoValor;
            System.out.println("Valor atualizado na posição " + posicao + ".");
        }

        if (vetor == null){
            System.out.println("Você não criou nenhum vetor para editar.");
        }

        return vetor;
    }

    public static int [] removerVetor(int [] vetor) {

        System.out.println("Removendo o vetor...");
        vetor = null;
        System.out.println("Vetor removido com sucesso.");

        return vetor;
    }



    public static void main(String[] args) {              // Minha main

        int op_0=-1, op_1;
        int vetor[] = new int[0];
        int matriz[][];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1: Vetor");
            System.out.println("2: Matriz");
            System.out.println("Escolha uma operação: ");
            op_0 = scanner.nextInt();

            if (op_0 < 1 || op_0 > 2) {
                System.out.println("Opção inválida.");
            } else if (op_0 == 1) {                             //Escolheu Vetor
                do {
                    System.out.println("Você escolheu Vetor.");
                    System.out.println("Escolha uma operação: ");
                    System.out.println("0: Sair do menu.");
                    System.out.println("1: Criar o vetor. ");
                    System.out.println("2: Visualizar o vetor.");
                    System.out.println("3: Editar o vetor. ");
                    System.out.println("4: Remover o vetor. ");
                    op_1 = scanner.nextInt();

                    if (op_1 < 0 || op_1 > 4) {
                        System.out.println("Opção Inválida.");
                    } else if (op_1 == 1) {
                        vetor = criarVetor();
                    } else if (op_1 == 2) {
                        visualizarVetor(vetor);
                    } else if (op_1 == 3) {
                        editarVetor(vetor);
                    } else if (op_1 == 4) {
                        vetor = removerVetor(vetor);
                    } else {
                        System.out.println("Você saiu do menu.");
                    }
                } while (op_1 != 0);


            } else {
                System.out.println("Você escolheu Matriz. ");
                System.out.println("Escolha uma operação: ");
                System.out.println("0: Sair do menu.");
                System.out.println("1: Criar a matriz. ");
                System.out.println("2: Preencher a matriz.");
                System.out.println("3: Visualizar a matriz. ");
                System.out.println("4: Editar a matriz. ");
                op_0 = scanner.nextInt();


            }


        } while (op_0 != 0);
    }
}



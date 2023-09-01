package OO;

public class ContaBancária {
    //Atributos
    float saldo;
    String nomeTitular;
    String cpf;

    //Metodos

    //Construtor Vazio
    public ContaBancária(){
        System.out.println("Construtor vazio ativo.");
    }

    //Construtor Completo
    public ContaBancária(float saldo, String nomeTitular, String cpf){
        System.out.println("Construtor completo ativado.");
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;

    }

    public float sacar(float valor) {
        if (saldo >= valor && valor > 0) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso.");

        } else {
            System.out.println("Valor solicitado maior do que o saldo.");
        }

        return saldo;
    }
}

package OO;

public class Gerente extends Funcionário {
    private String nome;
    private String cpf;
    private double salario;
    private int senha;
    private int numFuncGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumFuncGerenciados() {
        return numFuncGerenciados;
    }

    public void setNumFuncGerenciados(int numFuncGerenciados) {
        this.numFuncGerenciados = numFuncGerenciados;
    }

    public boolean autentica(int senha){
        if (this.senha == senha) {
            System.out.println("Acesso permitido.");
            return true;
        } else {
            System.out.println("Acesso negado.");
            return false;
        }
    }
    @Override
    public double getBonificação() {
        return super.getBonificação() + 1000;
    }


}


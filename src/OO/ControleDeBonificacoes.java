package OO;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes;

    public void registrar(Funcionário funcionário){
        this.totalDeBonificacoes += funcionário.getBonificação();
    }

    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;

    }

}

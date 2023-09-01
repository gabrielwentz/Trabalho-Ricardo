package OO;

public class ExecutarFuncionário {
    public static void main(String[] args) {
        /*Gerente gerente = new Gerente();
        gerente.setNome("Gabriel");
        gerente.setSenha(2201);


        System.out.println(gerente.getNome());
        System.out.println(gerente.getSenha());

        Funcionário funcionário = new Funcionário();
        funcionário.setSalario(500);
        System.out.println(funcionário.getBonificação());

        gerente.setSalario(5000);
        System.out.println(gerente.getBonificação());

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(1000);
        supervisor.getBonificação();
        System.out.println(supervisor.getBonificação());


         */

        ControleDeBonificacoes cdb = new ControleDeBonificacoes();

        Gerente funcionário1 = new Gerente();
        funcionário1.setSalario(5000);
        cdb.registrar(funcionário1);

        Funcionário funcionário2 = new Funcionário();
        funcionário2.setSalario(1000);
        cdb.registrar(funcionário2);

        System.out.println(cdb.getTotalDeBonificacoes());


    }
}

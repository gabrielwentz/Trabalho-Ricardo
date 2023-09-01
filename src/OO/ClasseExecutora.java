package OO;

public class ClasseExecutora {

    public static void main(String[] args) {
        float x;
        ContaBancária contaBancária = new ContaBancária();
        System.out.println(contaBancária.nomeTitular);
        contaBancária.saldo = 100;
        x = contaBancária.sacar(15.f);

        System.out.println(x);





    }
}

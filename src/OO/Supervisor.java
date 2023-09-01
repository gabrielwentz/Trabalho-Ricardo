package OO;

public class Supervisor extends Gerente{

    @Override
    public double getBonificação() {
        return super.getBonificação()+ 2000;
    }
}

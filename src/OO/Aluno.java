package OO;

public class Aluno extends Pessoa{
    private String matricula;
    private String dataIngresso;


    public Aluno(String nome, float altura, int idade, String matricula, String dataIngresso) {
        super(nome, altura, idade);
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public void estudar(){
        System.out.println(this.getNome() + " está estudando...");
    }


}

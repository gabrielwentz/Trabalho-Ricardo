package OO;

public class SalaDeAula {
    int qtdMesas;
    Aluno [] alunos;
    Professor professor;
    private String nome;

    public SalaDeAula(String nome, int qtdMesas, Aluno[] alunos, Professor professor) {
        this.qtdMesas = qtdMesas;
        this.alunos = alunos;
        this.professor = professor;
        this.nome = nome;
    }


    public int getQtdMesas() {
        return qtdMesas;
    }

    public void setQtdMesas(int qtdMesas) {
        this.qtdMesas = qtdMesas;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void salaEmUso(){
        System.out.println("A sala de aula está em uso com " + this.alunos[0].getNome() + " e o " + professor.getNome() + " é quem está ministrando a aula.");
    }

}

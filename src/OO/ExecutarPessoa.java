package OO;

public class ExecutarPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", 1.71f, 18);
        Aluno aluno = new Aluno("Ivan", 1.69f, 18, "0203", "25/02/2023");
        Aluno [] alunos = new Aluno[2];
        alunos[0] = new Aluno("Gabriel", 1.69f, 18, "0203", "25/02/2023");
       alunos[1] = new Aluno("Felipe", 1.69f, 18, "0203", "25/02/2023");
        Professor professor = new Professor("Ricardo", 1.78f, 29, "Programação", 36);
        SalaDeAula salaDeAula = new SalaDeAula("Lab 7", 8, alunos, professor );

        System.out.println(aluno.getIdade());
        aluno.estudar();
        professor.ministrarAula();
        salaDeAula.salaEmUso();
    }

}

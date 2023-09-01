package OO;

public class Professor extends Pessoa {
    private String disciplina;
    private int cargaHorariaSemanal;

    public Professor(String nome, float altura, int idade, String disciplina, int cargaHorariaSemanal) {
        super(nome, altura, idade);
        this.disciplina = disciplina;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public void ministrarAula(){
        System.out.println(this.getNome() + " está ministrando uma aula de : " + this.getDisciplina());
    }

}


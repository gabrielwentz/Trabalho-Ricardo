package OO;

public class Pessoa {
    private String nome;
    private float altura;
    private int idade;

    public Pessoa(String nome, float altura, int idade){

    this.nome = nome;
    this.altura = altura;
    this.idade = idade;
    }

    public Pessoa() {
    //Construtor
    }



    public void pensar(){
        System.out.println(this.nome + " está pensando...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

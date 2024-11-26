public class Pessoa {
    private String nome;

    public Pessoa() {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void digaOla(){
        System.out.println(nome + " diz: Olá meu amigo!");
    }

}

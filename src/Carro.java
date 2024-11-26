import java.time.LocalDate;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }

    int idadeCarro(){
        int anoAtual = LocalDate.now().getYear(); // Obtém o ano atual
        return anoAtual - ano;
    }
}

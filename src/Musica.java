public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes = 0;

    public Musica() {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    public int getNumAvaliacoes() {
        return numAvaliacoes;
    }


    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", avaliacao=" + informaMediaNotaMusica() +
                ", numAvaliacoes=" + numAvaliacoes +
                '}';
    }

    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double informaMediaNotaMusica(){
        if (avaliacao > 0){
           return (avaliacao / numAvaliacoes);
        } else
            return 0;
    }
}

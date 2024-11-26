public class POO_Fundamentos {
    public static void main(String[] args) {
        //Teste Classe Pessoa
        /* */
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Lucas");
        pessoa1.digaOla();

        //Teste Classe Calculadora
        /* */
        Calculadora numero1 = new Calculadora();
        double dobroNumero = numero1.dobraNumero(25);

        System.out.println("O dobro do número é: " + dobroNumero);


        //Teste Classe Musica
        /* */
        Musica musica = new Musica();
        musica.setTitulo("SATISFAZ");
        musica.setArtista("Palankin");
        musica.setAnoLancamento(2020);
        musica.avaliaMusica(6.9);
        musica.avaliaMusica(8.5);
        musica.avaliaMusica(9.5);

        int numAvaliacoes = musica.getNumAvaliacoes();
        System.out.println("Numero de Avaliacoes = " + numAvaliacoes + " e a média é " + musica.informaMediaNotaMusica());

        System.out.println(musica);


        //Teste Classe Carro
        /* */
        Carro veiculo = new Carro("HB20", "Branco", 2020);
        System.out.println(veiculo);
        System.out.println("O veiculo atual possui: " + veiculo.idadeCarro() + "anos");
    }
}
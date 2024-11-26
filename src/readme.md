# Projeto POO_Fundamentos - Explorando Programação Orientada a Objetos

Este projeto é uma aplicação Java que explora os conceitos fundamentais da Programação Orientada a Objetos (POO). Através de diferentes classes e instâncias, o código demonstra a criação de objetos, métodos, e a interação entre classes. O projeto inclui funcionalidades como avaliação de músicas, cálculo da idade de um carro e dobragem de números.

## Funcionalidades Principais

1. **Classe Pessoa:**
    - Permite criar uma pessoa e exibir uma saudação personalizada através do método `digaOla()`.

2. **Classe Calculadora:**
    - Possui um método `dobraNumero()` que recebe um número e retorna o dobro do valor.

3. **Classe Musica:**
    - Permite definir o título, artista e ano de lançamento da música, além de avaliar a música e calcular a média das avaliações.

4. **Classe Carro:**
    - Calcula a idade de um carro com base no ano de fabricação e exibe as informações do carro, como modelo, cor e ano.

## Estrutura do Projeto

### Classes e Métodos

- **POO_Fundamentos.java:**
    - Contém o método `main()` que testa todas as classes do projeto: `Pessoa`, `Calculadora`, `Musica`, e `Carro`.

- **Pessoa.java:**
    - Representa uma pessoa com métodos para definir e obter o nome, além de exibir uma saudação.

- **Calculadora.java:**
    - Implementa o cálculo de dobragem de números através do método `dobraNumero()`.

- **Musica.java:**
    - Representa uma música com métodos para definir seus atributos e calcular a média das avaliações.

- **Carro.java:**
    - Representa um carro e calcula sua idade com base no ano de fabricação.

### Exemplos de Uso

- Para criar uma pessoa e exibir uma saudação:
    ```java
    Pessoa pessoa1 = new Pessoa();
    pessoa1.setNome("Lucas");
    pessoa1.digaOla();
    ```

- Para dobrar um número:
    ```java
    Calculadora numero1 = new Calculadora();
    double dobroNumero = numero1.dobraNumero(25);
    System.out.println("O dobro do número é: " + dobroNumero);
    ```

- Para avaliar uma música e exibir a média das avaliações:
    ```java
    Musica musica = new Musica();
    musica.setTitulo("SATISFAZ");
    musica.setArtista("Palankin");
    musica.setAnoLancamento(2020);
    musica.avaliaMusica(6.9);
    musica.avaliaMusica(8.5);
    musica.avaliaMusica(9.5);
    System.out.println("Numero de Avaliacoes = " + musica.getNumAvaliacoes() + " e a média é " + musica.informaMediaNotaMusica());
    ```

- Para calcular a idade de um carro:
    ```java
    Carro veiculo = new Carro("HB20", "Branco", 2020);
    System.out.println("O veiculo atual possui: " + veiculo.idadeCarro() + " anos");
    ```

## Tecnologias Utilizadas

- **Java 8 ou superior:** Linguagem utilizada para o desenvolvimento.

## Como Executar o Projeto

1. Clone este repositório.
2. Compile e execute a classe principal `POO_Fundamentos.java` em seu ambiente de desenvolvimento Java.
3. Interaja com o código e visualize os resultados no console.

## Autor

- **Lucas Degrande**